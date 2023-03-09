package datastructure.object.custom;

public class Ex03ObjectPassingValue {
	public static void main(String[] args) {
		Item itA = new Item(1, 'A', 25f);
		modify(itA);
		System.out.println(itA.toString());
	}
	private static void modify(Item itInput) {
		itInput.price = 999.2f;
		Item itZ = new Item(7, 'Z', 77f);
		itInput = itZ;
		itInput.price = 12f;
	}
}
