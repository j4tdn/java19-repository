package definition;

public class ImmutableDemo {
	public static void main(String[] args) {
		ImmutableTest t1 = new ImmutableTest(17, "Hello");
		System.out.println("t1 -->" + t1);
	}
	//Java --> Available immutable class: Integer, Float, Double, Long, String...
	//immutable --> unable to modify value at HEAP
	//final --> unable to modify value at STACK
}
