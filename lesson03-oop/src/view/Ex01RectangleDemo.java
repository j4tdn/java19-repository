package view;

import bean.Rectangle;

public class Ex01RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		r1.setHeight(4);
		r1.setWidth(11);
		
		System.out.println("r1 -->" +r1);
		
		Rectangle r2 = new Rectangle(2, 4);
		System.out.println("r2 -->" +r2);
	}
}
