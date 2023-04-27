package ex04;

public class Ex04 {
	public static void main(String[] args) {
		int[] a = { 1, 5, 8, 9, 2, 5, 9 };
		System.out.println("Tổng =" +sum(a));

		int[] b = { 4, 2, 6, 6, 4, 15, 1 };
		System.out.println("Tổng =" +sum(b));

	}

	public static int sum(int[] arr) {
		//một mảng có ít hơn 3 phần tử mới tính tổng
		if (arr.length < 3) {
			return 0;
		}
		
		//Tìm phần tử nhỏ nhất và lớn nhất trong mảng
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		//Duyệt qua mảng và tính tổng

		int sum = 0;
		boolean minFound = false;
		boolean maxFound = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min && !minFound) {
				minFound = true;
			} else if (arr[i] == max && !maxFound) {
				maxFound = true;
			} else if (arr[i] != min && arr[i] != max) {
				boolean unique = true;
				for (int j = 0; j < i; j++) {
					if (arr[j] == arr[i]) {
						unique = false;
						break;
					}
				}
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == arr[i]) {
						unique = false;
						break;
					}
				}
				if (unique) {
					sum += arr[i];
				}
			}
		}

		return sum;
	}
}
