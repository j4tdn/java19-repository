package datastructure.object.available;

public class Ex02BasicArray {
	public static void main(String[] args) {
		int[] digits = new int[5];
		
		System.out.println("digit[0] = " + digits[0]);
		System.out.println("digit[2] = " + digits[2]);
		
		
		digits[1] = 99;
		System.out.println("digit[1] = " + digits[1]);
		
		
		//Khoi tao o nho and value for array
		String[] sequences = new String[] {
				"a", "b", "c", "d"
		};
		System.out.println("length: " + sequences.length);
		
		
		//for-index[0-length)
		for (int i = 0; i < sequences.length; i++) {
			System.out.println("value: " + sequences[i]);
		}     
		
		
		System.out.println("=====================");
		// for-each --> lay gia tri ko quan tam chi so
		for(String each: sequences) {
			System.out.println("each: " + each);
		}
	}
}
