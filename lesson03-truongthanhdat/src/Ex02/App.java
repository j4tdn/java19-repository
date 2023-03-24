package Ex02;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer cus1 = new Customer(1,"Adam","123", "New York");
		Customer cus2 = new Customer(2,"Kate","234", "California");
		Customer cus3 = new Customer(2,"Kevin","345", "Viet Nam");
		
		
		Item i1 = new Item(1,"IOS","Black",1500);
		Item i2 = new Item(2,"Adroid","Red",2500);
		Item i3 = new Item(3,"Hawai","Blue",3500);
		Item i4 = new Item(4,"WindowPhone","Yellow",1700);
		
//		ItemDetail id1 = new ItemDetail(i1, 2);
//		ItemDetail id2 = new ItemDetail(i2, 3);
//		ItemDetail id3 = new ItemDetail(i3, 4);
//		ItemDetail id4 = new ItemDetail(i4, 6);
//		
//		ItemDetail[] ids = {id1, id2, id3, id4};

		
		Order o1 = new Order(cus1,new ItemDetail[] {
				new ItemDetail(i1,3),
				new ItemDetail(i4,3),
				new ItemDetail(i2,3),
		}, LocalDateTime.of(2023, 03, 15, 07, 18, 56));
		
		Order o2 = new Order(cus2,new ItemDetail[] {
				new ItemDetail(i2,4),
				new ItemDetail(i3,5)
		}, LocalDateTime.of(2023, 03, 16, 07, 18, 56));
		
		Order o3 = new Order(cus3,new ItemDetail[] {
				new ItemDetail(i2,3),
				new ItemDetail(i3,5),
				new ItemDetail(i4,2),
		}, LocalDateTime.of(2023, 03, 15, 10, 18, 56));
		
		System.out.println("Order1 : " + OrderUtils.export(o1));
		System.out.println("Order2 : " + OrderUtils.export(o2));
		System.out.println("Order3 : " + OrderUtils.export(o3));
	}
}
