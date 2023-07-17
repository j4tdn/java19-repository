package view;

import java.util.Arrays;

import functional.CompareIntHelper;
import functional.CompareStringHelper;
import utils.SortUntils;

public class Ex03BubbeSortWithString {
	public static void main(String[] args) {
		String[] sequences = { null, null, "Alex", "Terry", null, "Rivaldo", "Blue", "Zill" };
		sortHandleNullLastValues(sequences);
		System.out.println(Arrays.toString(sequences));

		System.out.println("==========================");
		
		String[] textArrays = { "Alex", null, null, "Terry", null, "Rivaldo", "Blue", "Zill" };
		selectionSortKeepCurrentPositionNullValues(textArrays);
		System.out.println(Arrays.toString(textArrays));
		
		System.out.println("============Using strategy==============");
		String[] items = { "Alex", null, null, "Terry", null, "Rivaldo", "Blue", "Zill" };
		sort(items, new CompareStringHelper() {
			
			@Override
			public int compare(String s1, String s2) {
				//B1: Null First
				if(s1 == null) {
					return -1;
				}
				if(s2 == null) {
					return 1;
				}
				//sắp xếp giảm dần s2.compareTo(s1)
				//sắp xếp tăng dần
				return s1.compareTo(s2);
			}
		});
		System.out.println(Arrays.toString(items));
	}
	
	//using strategy pattern
	private static void sort(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				//source[i].compareTo(source[i + 1]) 
				if (helper.compare(source[i], source[i + 1]) > 0) {
					SortUntils.swap(source, i, i + 1);
				}
			}
		}
	}
	
	//giữ nguyên null 
	private static void selectionSortKeepCurrentPositionNullValues(String[] source) {
		for (int pivot = source.length - 1; pivot > 0; pivot--) {
			if (source[pivot] != null) {
				for (int i = 0; i < pivot; i++) {
					if (source[i] != null) {
						if (source[i].compareTo(source[pivot]) > 0) {
							SortUntils.swap(source, i, pivot);
						}
					}
				}
			}
		}
	}

	// B1:Xử lý null values -->Sử dụng [null first], null last
	// B2:Sau đó những phần tử khác null --> sắp xếp [tăng]/ giảm dần
	private static void sortHandleNullFirstValues(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				// Xử lý null first
				if (source[i] == null) {
					continue;
				}
				if (source[i + 1] == null) {
					SortUntils.swap(source, i, i + 1);
					continue;
				}

				// B2: Xắp xếp tăng dần cho những phần tử khác null
				if (source[i].compareTo(source[i + 1]) > 0) {
					SortUntils.swap(source, i, i + 1);
				}
			}
		}
	}

	// B1:Xử lý null values -->Sử dụng null first, [null last]
	// B2:Sau đó những phần tử khác null --> sắp xếp tăng/[giảm dần]
	private static void sortHandleNullLastValues(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				// Xử lý null last
				if (source[i] == null && source[i + 1] != null) {
					SortUntils.swap(source, i, i + 1);
					continue;
				}
				if (source[i + 1] == null) {
					continue;
				}

				// B2: Xắp xếp tăng dần cho những phần tử khác null
				if (source[i].compareTo(source[i + 1]) > 0) {
					SortUntils.swap(source, i, i + 1);
				}
			}
		}
	}

	// So sánh string --> sử dựng hàm compareTo
	private static void sort(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (source[i].compareTo(source[i + 1]) > 0) {
					SortUntils.swap(source, i, i + 1);
				}
			}
		}
	}

}
