package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex05 {
public static void main(String[] args) {
	HashMap<String , Double> expenses = new HashMap<>();
	
	expenses.put("Tiền điện", 3000.0);
	expenses.put("Tiền nước", 1500.0);
	expenses.put("Tiền mua đồ dùng cá nhân", 150000.0);
	expenses.put("Tiền ăn", 500000.0);
	expenses.put("Tiền đi lại", 300000.0);
	expenses.put("Tiền đi chơi", 1000000.0);
	
	System.out.println("Các khoản chi tiêu lớn hơn 500000 VND: ");
	for(Map.Entry<String, Double> entry : expenses.entrySet()){
		if(entry.getValue() > 500000.0) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " VND");
		}
	}
	
	List<Map.Entry<String, Double>> sortedByValue = new ArrayList<>(expenses.entrySet());
	Collections.sort(sortedByValue, new Comparator<Map.Entry<String, Double>>() {
		public int compare(Map.Entry<String, Double> entry1, Map.Entry<String, Double> entry2) {
			return Double.compare(entry2.getValue(), entry1.getValue());
		}
	});
	
	System.out.println("\n Các khoản chi tiêu theo thứ tự giảm dần bởi số tiền: ");
	for(Map.Entry<String, Double> entry : sortedByValue) {
		System.out.println(entry.getKey() + ": " + entry.getValue() + " VND");
	}
	
}
}
