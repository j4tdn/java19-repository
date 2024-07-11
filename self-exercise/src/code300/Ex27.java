package code300;

import java.util.Arrays;
import java.util.Scanner;

public class Ex27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        
		System.out.println("Nhập N:");
        int N = sc.nextInt();
        System.out.println("Nhập R:");
        int R = sc.nextInt();
        System.out.println("Nhập Q:");
        int Q = sc.nextInt();
        System.out.println("Nhập P:");
        double P = sc.nextDouble();
        
        int[] startTimes = new int[R];
        int[] endTimes = new int[R];
        
        for (int i = 0; i < R; i++) {
            startTimes[i] = sc.nextInt();
            endTimes[i] = sc.nextInt();
        }
        
        
        int[] Cars = new int[N + 1];
        Arrays.fill(Cars, Q);
        
        int request = 0;
        
        for (int i = 0; i < R; i++) {
            int startTime = startTimes[i];
            int endTime = endTimes[i];
            
            
            boolean canFulfill = true;
            for (int t = startTime; t < endTime; t++) {
                if (Cars[t] <= 0) {
                    canFulfill = false;
                    break;
                }
            }
            
            if (canFulfill) {
                for (int t = startTime; t < endTime; t++) {
                    Cars[t]--;
                }
            } else {
                request++;
            }
        }
        
        double unmetPercentage = (request * 100.0) / R;
        
        if (unmetPercentage > P) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
	}

