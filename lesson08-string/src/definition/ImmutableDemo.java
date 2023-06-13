package definition;

public class ImmutableDemo {
	public static void main(String[] args) {
		ImmutableTest t1 = new ImmutableTest(17, "Hello");
		System.out.println("t1 --> " + t1);
		
		// JAVA --> Available immutable class: Integer, Float, Double, Long, String ...
		// immutable --> Unable to modify values at HEAP
		// final	 --> Unable to modify value at STACK
		
		
	}
}
