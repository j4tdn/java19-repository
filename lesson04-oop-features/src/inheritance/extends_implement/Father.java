package inheritance.extends_implement;

public interface Father {
	void drinkBeer();
	default void coding() {
		System.out.println("backend");
	}
	
}
