package libraries;

public class Ex01Math {
public static void main(String[] args) {
	System.out.println("min: " + Math.min(5.6, 6.7));
	float fVal = 10f/3;
	
	System.out.println("fVal: " + fVal);
	System.out.println("Round: " + Math.round(fVal));
	System.out.println("Round up: " + Math.ceil(fVal));
	System.out.println("Round down: " + Math.floor(fVal));
}
}
