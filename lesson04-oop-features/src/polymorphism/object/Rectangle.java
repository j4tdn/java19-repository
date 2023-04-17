package polymorphism.object;

public class Rectangle extends Shape {
	//this doi tuong hien tai, goi den method cua class hien tai
	//super la doi tuong cua class cha, goi den method cua class hien tai
	@Override
	void paint() {
		System.out.println("Rectangle --> paint");
	}
	
	@Override
	void calArea() {
		System.out.println("Rectangle --> calArea");
	}
	
	//extends function
	void setBackground(){
		System.out.println("Rectangle --> setBackground");
	}
}
