package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		//declare object
		Student student1 = new Student(1,"Thành Đạt",95,"Quảng Ngãi");
		student1.setAge(23);
		System.out.println("Name of student 1 is : " + student1.getName());
		Student student2 = new Student(2,"Quang Lâm",23,"Quảng Nam");
		System.out.println("Information of student 1 : " + student1.toString());
		System.out.println("Information of student 2 : " + student2);
	}
}
