package inheritance.iinterface;

public interface Shape {
	
	// ngam dinh hieu la final
	int length = 15;

	// ngam dinh la public abstract
	void paint();

	void calArea();
	
	//default, static, private
	default void clear() {
		System.out.println("shape --> clear all");
	}

}
