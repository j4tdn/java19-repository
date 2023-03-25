package shopping;

import java.time.LocalDateTime;

public class App {
public static void main(String[] args) {
		
		Customer c1 = new Customer("KH1","Phu","0984571225","Quang Nam");
		Customer c2 = new Customer("KH2","Quoc","0774352613","Hue");
		Customer c3 = new Customer("KH3","Tuan","0247185732","Da Nang");
		Customer c4 = new Customer("KH4","Phat","0345712394","Hue");

		Item i1 = new Item("SS10+","Androi","Black",620);
		Item i2 = new Item("WP8","WindowPhone","Green",456);
		Item i3 = new Item("IP13","IOS","Blue",1345);
		Item i4 = new Item("IP12","IOS","White",987);
		Item i5 = new Item("SS8+","Androi","Black",840);
		
		Order o1 = new Order (c1,new ItemDetail[]{
				new ItemDetail(i4,1),
				new ItemDetail(i3,2),
				new ItemDetail(i1,1)	
			},LocalDateTime.of(2021, 5, 8, 10, 10, 10));

		Order o2 = new Order (c2,new ItemDetail[]{
				new ItemDetail(i5,2),
				new ItemDetail(i4,1)	
			},LocalDateTime.of(2021, 5, 8, 10, 46, 10));
		Order o3 = new Order (c4,new ItemDetail[]{
				new ItemDetail(i1,1),
				new ItemDetail(i2,2),
				new ItemDetail(i3,1)	
			},LocalDateTime.of(2021, 5, 8, 10, 20, 10));
		Order o4 = new Order (c3,new ItemDetail[]{
				new ItemDetail(i5,1)	
			},LocalDateTime.of(2021, 5, 9, 11, 10, 59));
		
		System.out.println("Order1 --> " + o1.export());
		System.out.println("Order2 --> " + o2.export());
		System.out.println("Order3 --> " + o3.export());
		System.out.println("Order4 --> " + o4.export());
		
		System.out.println("Order 1: " + o1 );
		System.out.println("Order 2: " + o2 );
		System.out.println("Order 3: " + o3 );
		System.out.println("Order 4: " + o4 );
	}


}
