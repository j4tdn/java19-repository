package main;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.logging.Logger;

import store.Store;
public class ADCV {
	static Map<Integer, BigDecimal> allocationKey;
    static Map<Integer, Integer> amountAllocatedCalc;
    static Map<Integer, Integer> demand;
    static Scanner sc = new Scanner(System.in);
    static List<Store> stores;
    static int amount;

    public static void main(String[] args) {
        // Mock data
        stores = mock();
        boolean condition = stores.stream()
                .allMatch(store -> store.getExpectedSales() == null);
        if (condition) {
            Logger logger = Logger.getLogger(Main.class.getName());
            logger.info("Expected sales cannot be calculated. Please add reference store or include stores with expected sales for interpolation");
            return;
        }
        stores.forEach(System.out::println);
        // Step 1
        System.out.println("\n===================== Step 1 =====================\n");
        allocate();
        stores.forEach(System.out::println);
        // Step 2
        System.out.println("\n===================== Step 2 =====================\n");
        allocationKey = allocateKey();
        System.out.println(allocationKey);
        // Step 3
        System.out.println("\n===================== Step 3 =====================\n");
        amount = sc.nextInt();
        demand = demandStore();
        if (printRes()) {
            Collection<Integer> res = amountAllocatedCalc.values();
            res.stream()
                    .forEach(t -> System.out.print(t + " "));
            return;
        }
    }

    public static List<Store> mock() {
        return Arrays.asList(
                new Store(1, null, 18f, 40f, false),
                new Store(2, null, 19f, 20f, false),
                new Store(3, null, 21f, 17f, false),
                new Store(4, null, 14f, 31f, false),
                new Store(5, null, 14f, 10f, false),
                new Store(6, null, 15f, 30f, false),
                new Store(7, 2, 15f, null, false),
                new Store(8, null, 12f, 19f, false),
                new Store(9, null, 17f, 26f, false),
                new Store(10, 7, 18f, null, false)
//                new Store(10, 7, 18f, null, false),
//                new Store(10, 7, 18f, null, false)
        );
    }

    public static void allocate() {
        Map<Integer, Float> map = new HashMap<>();

        stores.forEach(store -> {
            if (store.getExpectedSales() != null) {
                map.put(store.getStoreId(), store.getExpectedSales());
            }
        });
        double sum = stores.stream()
                .filter(store -> store.getExpectedSales() != null)
                .mapToDouble(Store::getExpectedSales)
                .sum();
        int count = (int) stores.stream()
                .filter(store -> store.getExpectedSales() != null)
                .count();
        final float avg = (float) (Math.round((count > 0 ? sum / count : 0.0) * 10.0) / 10.0);
        stores.stream()
                .filter(store -> store.getExpectedSales() == null)
                .forEach(store -> {
                    if (store.getReferenceStoreId() != null && map.get(store.getReferenceStoreId()) != null && !store.getSelected()) {
                        store.setExpectedSales(map.get(store.getReferenceStoreId()));
                        store.setSelected(true);
                    } else store.setExpectedSales(avg);
                });
    }

    public static Map<Integer, BigDecimal> allocateKey() {
        Map<Integer, BigDecimal> map = new HashMap<>();
        long sumAll = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.##########");
        for (Store store : stores) {
            sumAll += store.getExpectedSales();
        }
        for (Store store : stores) {
            BigDecimal key = new BigDecimal(store.getExpectedSales() / sumAll);
            key = key.setScale(10, RoundingMode.HALF_EVEN);
            map.put(store.getStoreId(), key);
        }
        return map;
    }

    public static Map<Integer, Integer> amountAllocate(int amountAllocated) {
        int sumStockPre = 0;
        for (Store store : stores) {
            sumStockPre += store.getStockPreviousDay();
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (Store store : stores) {
            int bd = (allocationKey.get(store.getStoreId()).multiply(BigDecimal.valueOf(amountAllocated + sumStockPre)).subtract(BigDecimal.valueOf(store.getStockPreviousDay()))).intValue();
            if (bd < 0) bd = 0;
            map.put(store.getStoreId(), bd);
        }
        return map;
    }

    private static int check(Map<Integer, Integer> map, int amount) {
        int sum = map.values()
                .stream()
                .mapToInt(t -> t)
                .sum();
        if (sum == amount) return 0;
        else if (sum > amount) return 1;
        else return -1;
    }

    private static boolean printRes() {
        amountAllocatedCalc = amountAllocate(amount);
        if (check(amountAllocatedCalc, amount) == 0) {
            return true;
        } else if (check(amountAllocatedCalc, amount) == 1) {
            sumAllocatedBigger();
        } else if (check(amountAllocatedCalc, amount) == -1) {
            sumAllocatedlower();
        }
        return false;
    }

    private static Map<Integer, Integer> demandStore() {
        Map<Integer, Integer> map = new HashMap<>();
        for (Store store : stores) {
            int temp = (int) (store.getExpectedSales() - store.getStockPreviousDay());
            if (temp < 0) temp = 0;
            map.put(store.getStoreId(), temp);
        }
        return map;
    }

    private static void sumAllocatedBigger() {
        int max = (int) -1e9;
        int currDemand = 0;
        Float curExpSales = 0f;
        int curStore = 0;
        for (Store store : stores) {
            if (amountAllocatedCalc.get(store.getStoreId()) == 0) continue;
            int differentCalc = amountAllocatedCalc.get(store.getStoreId()) - demand.get(store.getStoreId());
            if (max < differentCalc
                    || (max == differentCalc && currDemand > demand.get(store.getStoreId()))
                    || (max == differentCalc && currDemand == demand.get(store.getStoreId()) && curExpSales > store.getExpectedSales())
                    || (max == differentCalc && currDemand == demand.get(store.getStoreId()) && curExpSales == store.getExpectedSales() && store.getStoreId() < curStore)
            ) {
                max = differentCalc;
                currDemand = demand.get(store.getStoreId());
                curExpSales = store.getExpectedSales();
                curStore = store.getStoreId();
            }
        }
        amountAllocatedCalc.put(curStore, amountAllocatedCalc.get(curStore) - 1);
    }

    private static void sumAllocatedlower() {
        int min = (int) 1e9;
        int currDemand = 0;
        Float curExpSales = 0f;
        int curStore = 0;
        for (Store store : stores) {
            int differentCalc = amountAllocatedCalc.get(store.getStoreId()) - demand.get(store.getStoreId());
            if (min > differentCalc
                    || (min == differentCalc && currDemand < demand.get(store.getStoreId()))
                    || (min == differentCalc && currDemand == demand.get(store.getStoreId()) && curExpSales > store.getExpectedSales())
                    || (min == differentCalc && currDemand == demand.get(store.getStoreId()) && curExpSales == store.getExpectedSales() && store.getStoreId() < curStore)
            ) {
                min = differentCalc;
                currDemand = demand.get(store.getStoreId());
                curExpSales = store.getExpectedSales();
                curStore = store.getStoreId();
            }
        }
        amountAllocatedCalc.put(curStore, amountAllocatedCalc.get(curStore) + 1);
    }
}
