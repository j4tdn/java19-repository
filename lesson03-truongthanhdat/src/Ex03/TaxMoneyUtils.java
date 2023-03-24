package Ex03;

public class TaxMoneyUtils {
	public static double taxMoney(double cost, int capacity) {
		double taxMoney = 0;
		if(capacity < 100) {
			taxMoney = cost/100;
		}
		if(capacity >= 100 && capacity <= 200) {
			taxMoney = cost * 3/100;
		}
		if(capacity > 200) {
			taxMoney = cost/20;
		}
		return taxMoney;
	}
}
