package datastructure.object.available;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//demo integer
		int x = 10;
		System.out.println("x: " + x);
		
		Integer iA = new Integer(22);
		Integer iB = new Integer(44);
		Integer iC = new Integer(44);
		
		System.out.println("iA: " + iA);
		System.out.println("iB: " + iB);
		System.out.println("iC: " + iC);
		
		Integer oA = 66;
		Integer oB = 88;
		Integer oC = 88;
		
		System.out.println("oA: " + hash(oA));
		System.out.println("oB: " + hash(oB));
		System.out.println("oC: " + hash(oC));
	}
	
	private static int hash(Integer parameter) {
		return System.identityHashCode(parameter);
	}
}
