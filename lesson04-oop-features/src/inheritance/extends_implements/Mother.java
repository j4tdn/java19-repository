package inheritance.extends_implements;
interface Mother {
     void coffee() ;
     
 	default void coding() {
		System.out.println("frontend");
	}
}
