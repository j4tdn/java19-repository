package view;

public class Ex04 {
	public static void main(String[] args) {
		String str = "xyz";
	    allPermutation(str);
	}
	
	public static void allPermutation(String str) {
	    findAllPermutation(str.toCharArray(), 0);
	}

	private static void findAllPermutation(char[] arr, int index) {
	    if (index >= arr.length - 1) {
	        System.out.println(String.valueOf(arr));
	        return;
	    }

	    for (int i = index; i < arr.length; i++) {
	        swap(arr, index, i);
	        findAllPermutation(arr, index + 1);
	        swap(arr, index, i);
	    }
	}

	private static void swap(char[] arr, int i, int j) {
	    char temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

}
