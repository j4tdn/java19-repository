package inheritance.iinterface;

public interface Shape {
	
	//abstract method
	
	void paint();
	
	// ngầm định là public abstract
	
	void calArea();
	
	//default, static, private
	
	default void clear() {
		System.out.println("shape --> clear all");
	}
}
