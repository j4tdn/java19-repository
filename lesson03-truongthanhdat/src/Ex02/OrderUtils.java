package Ex02;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemdetails();
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			
			double idCost = item.getCost() * quantity;
			if( item.getCost() > 500 && LocalDate.of(2023,Month.MARCH,15).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}
}
