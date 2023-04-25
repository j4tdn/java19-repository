package inheritance.extends_implement;

public interface Mother {
	void coffee();
	default void coding() {
		System.out.println("frontend");
	}
}
