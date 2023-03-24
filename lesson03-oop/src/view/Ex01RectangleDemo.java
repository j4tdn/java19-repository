package view;

import bean.Rectangle;

public class Ex01RectangleDemo {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.setHeight(3);
		rec1.setWidth(7);
		
		Rectangle rec2 = new Rectangle(5,9);
		
		System.out.println(rec1.toString());
		System.out.println(rec2.toString());
		
		
	}
}	
