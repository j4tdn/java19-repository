import connection.DbConnection;
import persistence.entities.Sale;
import service.Impl.ShoppingServiceImpl;
import service.ShoppingService;

import java.text.SimpleDateFormat;
import java.util.*;

public class Application {
    private static final ShoppingService shoppingService;
    static {
        shoppingService = new ShoppingServiceImpl();
    }
    public static void main(String[] args) {

        // 1
        Date saleDate = new Date();
        List<Sale> sales = shoppingService.findBySaleDateOrderByCreatedTimeDescIdAsc(saleDate);
        for (Sale sale : sales) {
            System.out.println("Item ID: " + sale.getItem().getId() + ", Sale Date: " + sale.getSaleDate());
        }
        DbConnection.getSessionFactory().close();

        //2
        List<Object[]> inventorySummary = shoppingService.getInventorySummary();
        for (Object[] row : inventorySummary) {
            Long itemId = (Long) row[0];
            String itemName = (String) row[1];
            int totalQuantity = Objects.isNull(row[2]) ? 0 : ((Number) row[2]).intValue();
            System.out.println("Item ID: " + itemId + ", Item Name: " + itemName + ", Total Quantity: " + totalQuantity);
        }
        DbConnection.getSessionFactory().close();

        //3
        int year = 2024; // change it
        List<String> top3ItemNames = shoppingService.getTop3BestSellingItems(year);
        System.out.println("Top 3 best selling items in " + year + ":");
        for (String itemName : top3ItemNames) {
            System.out.println(itemName);
        }
        DbConnection.getSessionFactory().close();

        //4
        List<Object[]> itemDetailsByCategory = shoppingService.getItemDetails();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (Object[] row : itemDetailsByCategory) {
            Long itemId = (Long) row[0];
            String itemName = (String) row[1];
            String color = (String) row[2];
            String material = (String) row[3];
            String image1 = (String) row[4];
            String image2 = (String) row[5];
            String lastUpdate = dateFormat.format((Date) row[6]);
            Long supplierId = (Long) row[7];
            String categoryName = (String) row[8];

            System.out.println("ID: " + itemId + ", Name: " + itemName + ", Color: " + color + ", Material: " + material +
                    ", Image 1: " + image1 + ", Image 2: " + image2 + ", Last Update: " + lastUpdate +
                    ", Supplier ID: " + supplierId + ", Category Name: " + categoryName);
        }
        DbConnection.getSessionFactory().close();
    }
}
