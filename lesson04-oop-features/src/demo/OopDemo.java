package demo;

import inheritance.iinterface.Shape;

public class OopDemo {
	public static void main(String[] args) {
		Shape s = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("2");
			}
			
			@Override
			public void calArea() {
				// TODO Auto-generated method stub
				
			}
		};
		s.paint();
	}
}
