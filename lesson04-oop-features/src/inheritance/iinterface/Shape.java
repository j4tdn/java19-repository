package inheritance.iinterface;

public interface Shape {
	//abstract method
	
	void paint();
	
	void calArea();
	
	
	default void clear() {
		System.out.println("");
	}

}
