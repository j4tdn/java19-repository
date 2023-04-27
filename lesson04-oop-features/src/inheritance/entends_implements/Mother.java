package inheritance.entends_implements;

public interface Mother {
	void coffee();
	
	default void coding() {
		System.out.println("frontend");
	}
}
