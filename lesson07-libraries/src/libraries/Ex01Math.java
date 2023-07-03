package libraries;

public class Ex01Math {
	public static void main(String[] args) {
		System.out.println("minn ->>>" + Math.min(5.5, 9.5));
		
		float fVal = 10f/3;
		System.out.println("fVal:" + fVal);
		System.out.println("round:" + Math.round(fVal));
		System.out.println("round up:" + Math.ceil(fVal));
		System.out.println("round down:" + Math.floor(fVal));
		
	}
}
