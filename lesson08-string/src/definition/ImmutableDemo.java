package definition;

public class ImmutableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableTest t1 = new ImmutableTest(17, "Hello");
		System.out.println("t1 --> " + t1);
		
		//Java --> Available immutable class: Integer, Float, Double, Long, String...
		//immutable --> không thể sửa đổi giá trị tại HEAP
		//FINAL --> không thể sửa đổi giá trị tại  STACK

	}

}
