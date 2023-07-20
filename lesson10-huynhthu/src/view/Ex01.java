package view;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01 {
    public static void main(String[] args) {
		int[] origin = {1,2,3,4,3,1};
		System.out.println("remove duplicate: " + Arrays.toString(removeDup(origin)));
		
	}
    private static int[] removeDup(int[] origin) {
    	int length = origin.length;
    	int[] newA = new int[length];
    	int running = 0;
    	for (int i = 0; i < length; i++) {
    		if(!ArrayUtils.checkDuplicate(newA, origin[i])) {
    			newA[running++] = origin[i];
    		}
    	}
    	return Arrays.copyOfRange(newA, 0, running);
    }
}
