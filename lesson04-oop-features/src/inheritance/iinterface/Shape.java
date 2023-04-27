package inheritance.iinterface;

public interface Shape {
	
	//abstract method
	void paint();
	
	void calArea();
	
	//default, static, private
	 default void clear() {
		 System.out.println("clear all --->");
	 }
}
