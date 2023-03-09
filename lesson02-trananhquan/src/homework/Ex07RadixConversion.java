package homework;

public class Ex07RadixConversion {

	public static void main(String[] args) {
		System.out.println(decToBin(5));
	}
	
	private static String decToBin(int input) {
		if(input == 0) return "0";
		String binNum = "";
		while(input != 0) {
			binNum = String.valueOf(input % 2) + binNum;
			input = input / 2;
		}
		return binNum;
	}
}
