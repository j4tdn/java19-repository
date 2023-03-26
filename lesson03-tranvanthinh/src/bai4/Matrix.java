package bai4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class Matrix {
	private int m; // so hang
    private int n; // so cot
    private int[][] a;

    public Matrix() {
        m = 0;
        n = 0;
        a = new int[m][n];
    }

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        a = new int[m][n];
        Random rd = new Random();
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		a[i][j] = (1 + rd.nextInt(99));
        	}
        }
    }

    public int getElementAt(int i, int j) {
    	return a[i][j];
    }
    
    public Integer[] getRowK(int k) {
    	Integer[] temp = new Integer[n];
    	for( int i = 0; i < n; i++) {
    		temp[i] = a[k][i];
    	}
    	return temp;
    }
    
    public Integer[] getColK(int k) {
    	Integer[] temp = new Integer[m];
    	for( int i = 0; i < m; i++) {
    		temp[i] = a[i][k];
    	}
    	return temp;
    }
    
    public int getRowNum() {
        return m;
    }
    public int getColNum() {
        return n;
    }

    public void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public int minRow(int k) {
    	 int min =  Collections.min(Arrays.asList(getRowK(k)));
    	 return min;
    }
    public int maxCol(int k) {
    	int max =  Collections.max(Arrays.asList(getColK(k)));
   	 return max;
    }
}
