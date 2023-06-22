package Bai3;

import java.util.Arrays;
import java.util.Comparator;

public class Bai3Class {
	int index, no_of_fact;

	public Bai3Class(int i, int countFactors) {
		index = i;
		no_of_fact = countFactors;
	}

	public static int countFactors(int n) {
		int count = 0;
		int sq = (int) Math.sqrt(n);

		if (sq * sq == n)
			count++;

		for (int i = 1; i < Math.sqrt(n); i++) {
			if (n % i == 0)
				count += 2;
		}

		return count;
	}
	
	public static void printOnBasisOfFactors(int arr[], int n) {
		Bai3Class num[] = new Bai3Class[n];

		for (int i = 0; i < n; i++) {
			num[i] = new Bai3Class(i, countFactors(arr[i]));
		}

		Arrays.sort(num, new Comparator<Bai3Class>() {

			@Override
			public int compare(Bai3Class e1, Bai3Class e2) {
				if (e1.no_of_fact == e2.no_of_fact)
					return e1.index > e2.index ? -1 : 1;

				return e1.no_of_fact < e2.no_of_fact ? -1 : 1;
			}


		});
		for (int i = 0; i < n; i++)
			System.out.print(arr[num[i].index] + " ");
	}
}
