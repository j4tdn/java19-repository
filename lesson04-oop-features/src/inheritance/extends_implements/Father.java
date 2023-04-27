package inheritance.extends_implements;

public interface Father {
	void drinkBeer();
	
	default void coding() {
		System.out.println("backend");
	}
	
}
