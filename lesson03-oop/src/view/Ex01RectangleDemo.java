package view;

import bean.Rectangle;

public class Ex01RectangleDemo {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 4;
		r1.height = 2;
		System.out.println("r1: " + r1);
		
		Rectangle r2 = new Rectangle(8, 6);
		System.out.println("r2: " + r2);
		
	}
}
