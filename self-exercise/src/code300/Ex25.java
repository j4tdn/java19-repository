package code300;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ex25 {
public static void main(String[] args) {
	 Scanner ip = new Scanner(System.in);
     
	 System.out.println("Nhập N:");
     int N = ip.nextInt();
     System.out.println("Nhập R:");
     int R = ip.nextInt();
     System.out.println("Nhập Q:");
     int Q = ip.nextInt();
     System.out.println("Nhập P:");
     double P = ip.nextDouble();
     
     int[] startTimes = new int[R];
     int[] endTimes = new int[R];
     
     for (int i = 0; i < R; i++) {
         startTimes[i] = ip.nextInt();
         endTimes[i] = ip.nextInt();
     }
     
     
     PriorityQueue<Integer> Cars = new PriorityQueue<>();
     for (int i = 0; i < Q; i++) {
         Cars.offer(0);  
     }
     
     int request = 0;
     
     for (int i = 0; i < R; i++) {
         int startTime = startTimes[i];
         int endTime = endTimes[i];
         
         
         while (!Cars.isEmpty() && Cars.peek() <= startTime) {
             Cars.poll();
         }
         
         if (Cars.size() < Q) {
             Cars.offer(endTime);  
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


