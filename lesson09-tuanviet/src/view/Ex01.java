package view;

public class Ex01 {
	public static void main(String[] args) {
		 int[] arr1 = {2, 8, 9, 1, 6};
		    int[] arr2 = {2, 1, 1, 8, 9};
		    int commonElement = commonElement(arr1, arr2);
		    System.out.println("số phần tử chung: " + commonElement);
	}
	
	public static int commonElement(int[] arr1, int[] arr2) {
	    int i = 0, j = 0, count = 0;
	    while (i < arr1.length && j < arr2.length) {
	        if (arr1[i] < arr2[j]) {
	            i++;
	        }
	        else if (arr2[j] < arr1[i]) {
	            j++;
	        }
	        else {
	            count++;
	            i++;
	            j++;
	        }
	    }
	    return count;
	}


}
