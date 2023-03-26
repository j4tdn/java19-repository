package shopping;

import java.time.LocalDate;

public class OrderUtils {
	
	public static double export(Order order) {
		double totalOfMoney=0;
		ItemDetail[] ids = order.getItemDetails();
		for(ItemDetail id:ids) {
			Item item =id.getItem();
			double idCost = item.getCost()* id.getQuantity();
			if(idCost>590 && LocalDate.of(2021, 5, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost*=0.9;
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}
}
