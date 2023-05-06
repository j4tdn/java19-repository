package ex02;

import java.util.ArrayList;
import java.util.List;

public class SortArray {
	public static void main(String[] args) {
		int[] array = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		List<Integer> list5 = new ArrayList<>();
		List<Integer> list7 = new ArrayList<>();
		List<Integer> listRemain = new ArrayList<>();
		
		for(int num : array) {
			if(num%5!=0 && num%7==0) {
				list7.add(num);
			}
			else if(num%5==0 && num%7!=0 ){
				list5.add(num);
			}
			else listRemain.add(num);
		}
		
	    ArrayList<Integer> newArray = new ArrayList<>();
	    newArray.addAll(list7);
	    newArray.addAll(listRemain);
	    newArray.addAll(list5);

	    // In kết quả
	    for (int num : newArray) {
	        System.out.print(num + " ");
	    }
	}
}
