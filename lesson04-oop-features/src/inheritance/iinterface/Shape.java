package inheritance.iinterface;

public interface Shape {
	
	// ngầm định là final
	int lenght = 15;
	
	void paint();
	void calArea();
	
	// default static or private
	default void clear() {
		System.out.println("shape --> clear all");
	}
}
