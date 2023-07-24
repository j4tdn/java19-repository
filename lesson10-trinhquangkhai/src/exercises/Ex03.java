package exercises;


public class Ex03 {
public static void main(String[] args) {
	
	Item[] item1 = items1();
	Item[] item2 = items2();
	highestPriceItem(item1);
	highestPriceItem(item2);
	System.out.println("Mặt hàng có giá cao nhất của 101 là: " + item1[0].getName());
	System.out.println("Mặt hàng có giá cao nhất của 102 là: " + item2[0].getName());
}
public static Item[] items1() {
	return new Item[] {
	new Item(1, "A", 25, 101),
	new Item(4, "D", 40, 101),
	new Item(6, "F", 18, 101),
};
}
public static Item[] items2() {
	return new Item[] {
	new Item(2, "B", 90, 102),
	new Item(3, "C", 88, 102),
	new Item(5, "E", 60, 102),
	};
}
private static void highestPriceItem(Item[] item) {
	for(int i = 0; i < item.length; i++) {
		for(int j = 0; j < item.length - i - 1; j++) {
			if(item[j].getSalesPrice() < item[j + 1].getSalesPrice()) {
				ArrayFunctional.swap(item, j, j + 1);
			}
		}
	}
	
	
}
}
