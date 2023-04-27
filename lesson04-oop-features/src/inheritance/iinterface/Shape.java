package inheritance.iinterface;

public interface Shape {

	void paint();

	void calArea();
	
	default void clear() {
		System.out.println("shape --> clear all");
	}
	
}
