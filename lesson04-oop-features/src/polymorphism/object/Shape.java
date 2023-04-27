package polymorphism.object;

public class Shape {
	
	//ham chung(giao dien), co phan khai bao, nhung chua co than ham
	//than ham se dc dinh nghia cu the trong lop thuc thi(con)
	
	//ve hinh
	void paint() {
		System.out.println("Shape --> paint");
	}
	
	//tinh dien tich
	//chua biet shape cu the de tinh dien tich -->in tam ra
	void calArea() {
		System.out.println("Shape --> calArea");
	}
}
