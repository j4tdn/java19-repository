package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        int[] array1 = {2, 8, 9, 1, 6};
        int[] array2 = {2, 1, 1, 8, 9};

        ArrayList<Integer> TheSameElements = FindTheSameElements(array1, array2);

        System.out.print("Output: ");
        for (int element : TheSameElements) {
            System.out.print(element + " ");
        }
    }

    public static ArrayList<Integer> FindTheSameElements(int[] array1, int[] array2) {
        ArrayList<Integer> TheSameElements = new ArrayList<>();
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                if (TheSameElements.isEmpty() || TheSameElements.get(TheSameElements.size() - 1) != array1[i]) {
                	TheSameElements.add(array1[i]);
                }
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return TheSameElements;
    }
}
