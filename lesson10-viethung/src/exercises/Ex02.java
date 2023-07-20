package exercises;

import java.util.*;

public class Ex02 {
	static int n, m;

	static class Node {
		int r, c;

		public Node(int r, int c) {
			this.r = r;
			this.c = c;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}

	public static boolean onBound(int r, int c) {
		return r < n && c < m && r >= 0 && c >= 0;
	}

	private static void fillRow(Node s, int[][] arr) {
		int r = s.r;
		int c = s.c;
		int running = 1;
		while (true) {
			if(onBound(r, c + running)) {
				arr[r][c + running] = 0;
			}
			if (onBound(r, c - running)) {
				arr[r][c - running] = 0;
			} 
			if(!onBound(r, c + running) && !onBound(r, c - running)) {
				return;
			}
			running++;
		}
	}
	private static void fillColumn(Node s, int[][] arr) {
		int r = s.r;
		int c = s.c;
		int running = 1;
		while (true) {
			if(onBound(r  + running, c)) {
				arr[r + running][c] = 0;
			}
			if (onBound(r - running, c)) {
				arr[r - running][c] = 0;
			} 
			if(!onBound(r + running, c) && !onBound(r - running, c)) {
				return;
			}
			running++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 5;
		m = 4;
		int[][] arr = new int[n][m];
		Node node = new Node();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] == 0) {
					node.r = i;
					node.c = j;
				}
				/*
				 1 2 3 4 
				 5 6 8 7 
				 1 9 0 9 
				 2 9 6 5 
				 1 2 4 5
				 */
			}
		}
		fillRow(node, arr);
		fillColumn(node, arr);
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]);
			}
		}
	}
}
