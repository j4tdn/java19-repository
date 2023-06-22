package exam;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] array = {8, 5, 9, 20};
        int n = array.length;

        System.out.println("Input Array: " + Arrays.toString(array));

        // Sắp xếp mảng theo level tăng dần
        sortByLevel(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    private static void sortByLevel(int[] array) {
        int n = array.length;
        int[] levels = new int[n];

        // Tính level 
        for (int i = 0; i < n; i++) {
            levels[i] = countFactors(array[i]);
        }

        // Sắp xếp mảng theo level tăng dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (levels[j] > levels[j + 1]) {
                    // Hoán đổi vị trí các số trong mảng
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Hoán đổi vị trí level tương ứng
                    temp = levels[j];
                    levels[j] = levels[j + 1];
                    levels[j + 1] = temp;
                }
            }
        }
    }

    // Hàm đếm số ước số của một số nguyên
    private static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
