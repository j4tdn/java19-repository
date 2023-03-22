package view;

import bean.Car;

public class Ex02CarDemoStaticAttribute {
	public static void main(String[] args) {
		Car.model = "audi";
		Car c1 = new Car("01", "red",120000);//H1
		Car c2 = new Car("02", "black",200000);//H2
		Car c3 = new Car("03", "white",100000);//H3
		Car c4 = new Car("04", "yellow", 220000);//H4
		Car c5 = new Car("05", "blue",210000);//H5
		Car c6 = new Car("06", "violet", 130000);//H6
		
		//model --> MG -->setModel n lan
		Car.model = "MG";
		//c3.setModel("MG");
		
		//khi yeu cau tat ca xe co model cung gia tri
		//neu luu bien model rieng cho moi object
		//+ton vung nho cho viec cung gia tri
		//+co the sai (nhung object co the co model khac nhau)
		
		//solution: model thanh attribute chung, gia tri cua class
		
		//static: thuoc pham vi cua class
		//		: all object tao ra tu class deu co static attribute
		
		//non-static: thuoc pham vi cua object
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("c4: " + c4);
		System.out.println("c5: " + c5);
		System.out.println("c6: " + c6);
		
	}
}
