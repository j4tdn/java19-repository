package ex02shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {

		Customer c1 = new Customer("KH1", "Xuan Hung", "123", "VietNam");
		Customer c2 = new Customer("KH2", "Thuong", "234", "US");
		
		Item i1 = new Item("OppoA", "Android", "Black", 1000);
		Item i2 = new Item("Xiaomi", "Android", "Green", 2000);
		Item i3 = new Item("IP8", "IOS", "White", 3000);
		Item i4 = new Item("IP12", "IOS", "Black", 4000);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,1),
				new ItemDetail(i2, 2),
				new ItemDetail(i3, 3)
		}, LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i1,1),
				new ItemDetail(i4, 2)
		}, LocalDateTime.of(2021, 5, 7, 20, 10, 12));
		
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i2,1),
				new ItemDetail(i3,2)
		}, LocalDateTime.of(2021, 5, 8, 9, 28, 32));
		
		
		System.out.println("Order 1: " + OrderUtils.export(o1));
		System.out.println("Order 2: " + OrderUtils.export(o2));
		System.out.println("Order 3: " + OrderUtils.export(o3));
		
	}
}
