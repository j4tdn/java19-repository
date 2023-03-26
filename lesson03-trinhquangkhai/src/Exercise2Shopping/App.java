package Exercise2Shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		
	
Customer c1 = new Customer("KH1", "Adam", "123", "New York");
Customer c2 = new Customer("KH2", "Kate", "243", "California");

Item it1 = new Item("SS10+", "Android", "Black", 620);
Item it2 = new Item("SS20U+", "Android", "Green", 840);
Item it3 = new Item("IP4", "IOS", "White", 280);
Item it4 = new Item("IP12", "IOS", "Black", 880);
Item it5 = new Item("WP8", "WindowPhone", "Blue", 560);

Order o1 = new Order(c1, new ItemDetail[] {
		new ItemDetail(it1, 3),
		new ItemDetail(it4, 5),
		new ItemDetail(it2, 1),}, 
		LocalDateTime.of(2021, 5, 8, 10, 10, 10));
Order o2 = new Order(c2, new ItemDetail[] {
		new ItemDetail(it3, 2),
		new ItemDetail(it5, 1),}, 
		LocalDateTime.of(2021, 5, 7, 20, 10, 12));
Order o3 = new Order(c2, new ItemDetail[] {
		new ItemDetail(it4, 1),}, 
		LocalDateTime.of(2021, 5, 8, 9, 21, 32));
System.out.println("Order 1: " + o1.export());
System.out.println("Order 2: " + o2.export());
System.out.println("Order 3: " + o3.export());

}
	}




