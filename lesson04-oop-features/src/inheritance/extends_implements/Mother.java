package inheritance.extends_implements;

public interface Mother {
	void coffe();
	
	default void coding () {
		System.out.println("fronend");
	}
}
