package bean;

public class Ex2Utils {
	public static boolean isDivisibleby5(Integer integer) {
		return (integer%5==0);
	}
	public static boolean isDivisibleby7(Integer integer) {
		return (integer%7==0);
	}
	public static boolean isDivisibleby7And5(Integer integer) {
		return (isDivisibleby5(integer)&&isDivisibleby7(integer));
	}
	
}
