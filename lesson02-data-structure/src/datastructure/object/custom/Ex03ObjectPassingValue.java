package datastructure.object.custom;

public class Ex03ObjectPassingValue {
	public static void main(String[] args) {
		Student stuA = new Student(1,"a",22,"a");
		modify(stuA);
		System.out.println("stuA name:" + stuA.getName());
	}
	
	//pass by value? pass by reference
	//
	
	private static void modify(Student stuA) {
		stuA.setName("Thành Đạt");
		Student stuB = new Student(2,"b",22,"b");
		stuA = stuB;
		stuA.setName("Quang Lâm");
	}
}
