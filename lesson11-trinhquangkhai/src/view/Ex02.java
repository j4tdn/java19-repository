package view;

public class Ex02 {
public static void main(String[] args) {
	CDStore store = new CDStore();
	
	CD cd1 = new CD(1, "Pop", "Justine Bieber", 12, 125.000);
	CD cd2 = new CD(2, "K-Pop", "BTS", 7, 300.000);
	CD cd3 = new CD(3, "V-Pop", "Sơn Tùng", 10, 500.000);
	
	store.addCD(cd1);
	store.addCD(cd2);
	store.addCD(cd3);
	System.out.println("The quantity of CD in List: " + store.quantity_CD());
	System.out.println("Price of CD " + store.price_CD() + "VND");
	
	store.sortedReduce_Price();
	System.out.println("\n List of CD after sorted reduce by price: ");
	for(CD cd : store.List_CD) {
		System.out.println("Code of CD: " + cd.getCode() + ", Price of CD " + cd.getPrice() + " VND");
	}
	
	store.sortedIncrease_Code();
	System.out.println("\n List of CD after sorted increase by Code: ");
	for(CD cd : store.List_CD) {
		System.out.println("Code of CD: " + cd.getCode() + ", Price of CD " + cd.getPrice() + " VND");
	}
}
}
