package inheritance.extends_implements;

interface Father {
	
	void drinkBeer() ;
	
	default void coding() {
		System.out.println("backend");
	}
     
}
