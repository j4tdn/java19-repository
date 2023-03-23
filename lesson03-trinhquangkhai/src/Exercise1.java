
public class Exercise1 {
public static void main(String[] args) {
	int[] numbers = new int[6];
	numbers[3] = 25;
	
	for(int i = 0; i < numbers.length; i++) {
		System.out.println("Value at index " +i+ ": " + numbers[i] );
	}
	
	for(int number: numbers) {
		System.out.println("numbers: " + numbers);
	}
	System.out.println("\n==============");
	String[] sequences = {"hello" , "hi", "welcome"};
	System.out.println("length: " + sequences.length);
	for(String sequence: sequences) {
		System.out.println(sequences);
	}
}
}
