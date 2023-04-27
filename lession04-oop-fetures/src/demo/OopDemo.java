package demo;

import inheritance.iinterface.Shape;

public class OopDemo {
	public static void main(String[] args) {
		Shape s = new Shape() {
			
			@Override
			public void paint() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void calArea() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//default --> public abstract
		s.paint();
	}
}
