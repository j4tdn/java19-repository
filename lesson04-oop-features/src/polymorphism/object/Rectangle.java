package polymorphism.object;

//Hinh chu nhat
public class Rectangle extends Shape{
    //this: doi tuong hien tai
	//super: doi tuong cua lop cha
	
	@Override
	void paint() {
		System.out.println("Rectangle --> paint");
	}
	@Override
	void calArea() {
		System.out.println("Rectangle --> calArea");
	}
	
	//extend function
	void setBackground() {
		System.out.println("Reactangle --> setBackground");
	}
}
