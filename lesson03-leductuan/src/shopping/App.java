package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("KH1","Tuan","123","Da Nang");
		Customer c2 = new Customer("KH2","Phu","234","Quang Nam");
		Customer c3 = new Customer("KH3","Phat","345","Hue");
		Customer c4 = new Customer("KH4","Quoc","456","Hue");
		
		Item i1 = new Item("SS10+","Androi","",620);
		Item i2 = new Item("WP8","WindowPhone","",456);
		Item i3 = new Item("IP5","IOS","",345);
		Item i4 = new Item("IP12","IOS","",987);
		Item i5 = new Item("SS8+","Androi","",840);
		
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
			},LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		Order o4 = new Order (c3,new ItemDetail[]{
				new ItemDetail(i5,1)	
			},LocalDateTime.of(2021, 6, 8, 11, 10, 59));
		System.out.println("Order1: "+OrderUtils.export(o1));
		System.out.println("Order2: "+OrderUtils.export(o2));
		System.out.println("Order3: "+OrderUtils.export(o3));
		System.out.println("Order4: "+OrderUtils.export(o4));
		 
	}
}
