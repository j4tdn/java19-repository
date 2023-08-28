package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CDStore {
public ArrayList<CD> List_CD;

public CDStore() {
	List_CD = new ArrayList<>();
}
public void addCD(CD cd) {
	for(CD existingCD: List_CD) {
		if(existingCD.getCode() == cd.getCode()) {
			System.out.println("Mã CD đã tồn tại!. Không thể thêm CD");
			return;
		}
	}
	List_CD.add(cd);
	System.out.println("Thêm cd thành công.");
}
public int quantity_CD() {
	return List_CD.size();
}
public double price_CD() {
	double sum = 0;
	for(CD cd : List_CD) {
		sum += cd.getPrice();
	}
	return sum;
}
public void sortedReduce_Price() {
	Collections.sort(List_CD, new Comparator<CD>() {
		public int compare(CD cd1, CD cd2) {
			return Double.compare(cd2.getPrice(), cd1.getPrice());
		}
	});
}
public void sortedIncrease_Code() {
	Collections.sort(List_CD, new Comparator<CD>() {
		public int compare(CD cd1, CD cd2) {
			return Integer.compare(cd1.getCode(), cd2.getCode());
		}
	});
}

}
