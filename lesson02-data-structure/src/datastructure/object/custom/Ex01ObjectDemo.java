package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		Item itZ = new Item(55, 'Z', 555);
		System.out.println("itZ id --> " + itZ.id);
		System.out.println("itZ name --> " + itZ.name);
		System.out.println("itZ price --> " + itZ.price);
		System.out.println(itZ.toString());
	}
}
