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
		// default of interface --> public abstract
		s.paint();
	}

}
