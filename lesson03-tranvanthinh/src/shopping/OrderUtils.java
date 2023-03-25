package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	public static double export(Order o) {
		double totalMoney = 0;
		ItemDetail[] ids = o.getItemDetail();
		for (ItemDetail id : ids) {
			double idCost = id.getItem().getCost();
			if (LocalDate.of(2021, Month.MAY, 8).isEqual(o.getOrderDate().toLocalDate()) && idCost > 590) {
				idCost = idCost * 0.9;
			}
			totalMoney += id.getQuantity() * idCost;
		}
		return totalMoney;
	}
}
