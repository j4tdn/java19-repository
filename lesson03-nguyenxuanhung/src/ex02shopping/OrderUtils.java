package ex02shopping;

import java.time.LocalDate;

public class OrderUtils {
	
	private OrderUtils(){
		
	}
	
	// o1,o2,o3: result depend on object --> non-static
		public static double export(Order order) {
			double totalOfMoney = 0;
			ItemDetail[] ids = order.getItemDetails();
			for (ItemDetail id : ids) {
				Item item = id.getItem();
				int quantity = id.getQuantity();
				double idcost = item.getPrice() * quantity;
				
				if (item.getPrice() > 590 && LocalDate.of(2022, 5, 5).equals(order.getOrderDate().toLocalDate())) {
					idcost *= 0.9;
				}
				totalOfMoney += idcost;
			}
			return totalOfMoney;
		}
}
