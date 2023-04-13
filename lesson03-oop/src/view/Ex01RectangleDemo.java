package view;

import bean.Rectangle;

public class Ex01RectangleDemo {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
//		r1.width = 2;
//		r1.height = 1;
		
		Rectangle r2 = new Rectangle(3, 4);
		System.out.println("r1 ==> " + r1);
		System.out.println("r2 ==> " + r2);
	}
}
