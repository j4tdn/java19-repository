package polymorphism.object;

public class Rectangle extends Shape {

	//alt left|right
	//this: doi tuong hien tai
	//	  : goi den nhung thuoc tinh hoac phuong thuc cua lop hien tai
	
	//super: doi tuong cua lop cha
	//	   : goi den nhung thuoc tinh phuong thuc cua lop cha
	
	@Override
	void paint() {
		System.out.println("Rectangle --> paint");
	}
	
	@Override
	void calArea() {
		System.out.println("Rectangle --> calArea");
	}
	
	//extend function
	void setBackGround() {
		System.out.println("Rectangle --> setBackgroud");
	}
	
	
}
