package view;

import bean.Item;
import bean.Store;
import model.DataModel;
import utils.NumberUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class DeliveryApp {

    public static void main(String[] args) {
        checkPlanningAmount();

        /*
         A nhớ để thời gian thoải mái tầm 3h nhưng e chỉ code được 2 steps ít vậy Nam ?
         */
        fillGapsWithReferencesOrAverage();
    }

    private static void checkPlanningAmount() {
        List<Store> storesA55 = DataModel.mockStoresOfRefItemA55();

        for (Store store : storesA55) {
        	/*
        	 Hình như Nam chưa hiểu đề bài
        	 Planning Amount là số lượng sản phần cần phân phối từ kho hàng đến cửa hàng
        	 Là do người dùng điền vào, nó ko liên qua gì đến store potential cả em nha
        	 */
            BigDecimal planningAmount = store.getStorePotential();

            System.out.println("Planning Amount for Store " + store.getStoreId() + ": " + planningAmount);

            if (planningAmount.compareTo(NumberUtils.bd(100)) <= 0) {
                System.out.println("Calculation stopped for Store " + store.getStoreId());
                break;
            }
        }
    }

    private static void fillGapsWithReferencesOrAverage() {
        List<Store> storesA55 = DataModel.mockStoresOfRefItemA55();

        Map<Integer, Integer> refStores = DataModel.mockRefStores();

        Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();

        for (Store store : storesA55) {
            BigDecimal potential = store.getStorePotential();

            if (potential == null || potential.compareTo(BigDecimal.ZERO) == 0) {
                Integer refStoreId = refStores.get(store.getStoreId());

                if (refStoreId != null) {
                    for (Store refStore : storesA55) {
                        if (refStore.getStoreId().equals(refStoreId)) {
                            store.setStorePotential(refStore.getStorePotential());
                            break;
                        }
                    }
                } else {
                    BigDecimal sumPotential = BigDecimal.ZERO;
                    int count = 0;
                    for (Store avgStore : storesA55) {
                        BigDecimal avgPotential = avgStore.getStorePotential();
                        if (avgPotential != null && avgPotential.compareTo(BigDecimal.ZERO) != 0) {
                            sumPotential = sumPotential.add(avgPotential);
                            count++;
                        }
                    }

                    if (count > 0) {
                        BigDecimal averagePotential = sumPotential.divide(BigDecimal.valueOf(count), 1, BigDecimal.ROUND_HALF_UP);
                        store.setStorePotential(averagePotential);
                    }
                }

                System.out.println("Potential for Store " + store.getStoreId() + " filled: " + store.getStorePotential());
            }
        }
    }
}
