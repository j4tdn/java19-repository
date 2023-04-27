package inheritance.entends_implements;

public interface Father {
	
	void drinkBeer();
	
	default void coding() {
		System.out.println("backend");
	}
}
