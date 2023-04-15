package controlling;

public class Ex05BasicArray {
      public static void main(String[] args) {
		//Mảng là kdl đối tượng
    	 // 5 là độ dài lenght của mảng
    	 // tạo 1 ô nhớ ở vùng nhớ HEAP lưu 5 giá trị mặc định của kiểu int
    	  int[] digits = new int[5];
		System.out.println("digits[0] = " + digits[0]);
		System.out.println("digits[2] = " + digits[2]);
		// gan gia tri
		digits[1] = 99;
		System.out.println("digits[1] = " + digits[1]);

        // khởi tạo ô nhớ và gán giá trị cho mảng
		String[] sequences = new String [] {"a", "b", "c", "d"};// new String k cos cg ok
		System.out.println("length: " + sequences.length);
		// for-index[0-length)
		for (int i = 0; i < sequences.length; i++) {
			System.out.println("value: " + sequences[i]);
		}
		// for each (element) --> laasy gias trij ko quan tram chi so
		// each teen bieens
		for(String each: sequences) {
			System.out.println("each: " + each);
		}
	}
}
