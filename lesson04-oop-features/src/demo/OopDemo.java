package demo;

import inheritance.iinterface.Shape;

public final class OopDemo {
	public static void main(String[] args) {
		Shape s = new Shape() {
			
			@Override
			public void paint() {
				
			}
			
			@Override
			public void calArea() {
				
			}
		};
		// default --> public abstract
		s.paint();
	}
}
