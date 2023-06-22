package view;

//import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Ex01CommonElementCounter {
	private static HashMap<Integer, Integer> hashMap = new HashMap<>();

	public static void main(String[] args) {
		int a[] = { 2, 8, 9, 1, 6 };
		int b[] = { 2, 1, 1, 8, 9 };
		findDupes(a, b);
//		System.out.println(Arrays.toString(getCommonElements(a, b)));
	}

	public static void findDupes(int[] a, int[] b) {
		
		if (a.length != b.length && a.length <= 4 && b.length <= 4 && a.length >= 40 && b.length >= 40)
			throw new IllegalArgumentException("2 Input Arrays Must Have The Same Length From 5 To 39!");
		
		HashSet<Integer> map = new HashSet<Integer>();
		HashSet<Integer> rs = new HashSet<Integer>();
		for (int i : a)
			map.add(i);
		for (int i : b) {
			if (map.contains(i))
				rs.add(i);
		}
		System.out.println(rs.toString());
	}

//	private static int[] getCommonElements(int[] a, int[] b) {
//		if (a.length != b.length && a.length <= 4 && b.length <= 4 && a.length >= 40 && b.length >= 40)
//			throw new IllegalArgumentException("2 Input Arrays Must Have The Same Length From 5 To 39!");
//
//		int[] res = new int[a.length];
//		for (int i = 0; i < a.length; i++) {
//			if (hashMap.containsKey(a[i])) {
//				hashMap.put(a[i], hashMap.get(a[i]) + 1);
//			} else {
//				hashMap.put(a[i], 1);
//			}
//		}
//
//		int counting = 0;
//		for (int i = 0; i < b.length; i++) {
//			if (hashMap.containsKey(b[i])) {
//				hashMap.remove(b[i]);
//				res[counting++] = b[i];
//			}
//		}
//		int[] finalRes = Arrays.copyOfRange(res, 0, counting);
//		Arrays.sort(finalRes);
//		return finalRes;
//	}
}
