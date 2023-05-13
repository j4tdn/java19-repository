package ex02;

import java.util.Arrays;

public class Ex02 {
        public static void main(String[] args) {
            int[] arr = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
            int[] divisibleBySeven = new int[arr.length];
            int[] divisibleByFive = new int[arr.length];
            int[] divisibleByBoth = new int[arr.length];
            int[] others = new int[arr.length];
            int sevenIndex = 0;
            int fiveIndex = 0;
            int bothIndex = 0;
            int othersIndex = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
                    divisibleBySeven[sevenIndex++] = arr[i];
                } else if (arr[i] % 5 == 0 && arr[i] % 7 != 0) {
                    divisibleByFive[fiveIndex++] = arr[i];
                } else if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {
                    divisibleByBoth[bothIndex++] = arr[i];
                } else {
                    others[othersIndex++] = arr[i];
                }
            }

            int[] result = new int[arr.length];
            System.arraycopy(divisibleBySeven, 0, result, 0, sevenIndex);
            System.arraycopy(divisibleByBoth, 0, result, sevenIndex, bothIndex);
            System.arraycopy(others, 0, result, sevenIndex + bothIndex, othersIndex);
            System.arraycopy(divisibleByFive, 0, result, sevenIndex + bothIndex + othersIndex, fiveIndex);

            System.out.println(Arrays.toString(result));
        }
}
