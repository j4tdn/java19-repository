package view.kt;

import java.util.Arrays;
import java.util.Optional;

/**
 Viết hàm liệt kê các phần tử chỉ xuất hiện một lần duy nhất 
 trong mảng. 
 Kết quả trả về được sắp xếp tăng dần. Ví dụ
 VD: int[] a = {3, 15, 21, 0, 15, 17, 21} --> Kết quả: 0, 3, 17
 *
 */
public class Ex04UniqueNumber {
	public static void main(String[] args) {
		int[] a = {3, 15, 21, 0, 15, 17, 21, 15, 0};
		System.out.println("unique numbers: " + Arrays.toString(getUniqueNumbers(a)));
	}
	
	private static int[] getUniqueNumbers(int[] elements) {
		// B1: Tìm số lần xuất hiện của mỗi phần tử trong mảng
		// {3,1}, {15,1}, {21,1}, {0,1}, null, null, null
		Tuple[] tuples = new Tuple[elements.length];
		int running = 0;
		for (int element: elements) {
			Optional<Tuple> tupleOpt = get(tuples, element, running);
			if (tupleOpt.isPresent()) {
				// tăng số lần xuất hiện lên ++
				tupleOpt.get().plus();
			} else {
				// đưa element vào tuples với count = 1
				Tuple newTuple = new Tuple(element, 1);
				tuples[running++] = newTuple;
			}
		}
		tuples = Arrays.copyOfRange(tuples, 0, running);
		
		// B2: Lấy ra những phần tử xuất hiện 1 lần
		running = 0;
		int[] result = new int[tuples.length];
		for (Tuple tuple: tuples) {
			if (tuple.isUnique()) {
				result[running++] = tuple.getValue();
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	// Optional(non-null)
	//    Tuple(null, non-null)
	// Hỗ trợ các hàm để xử lý trước khi lấy value(Tuple) ra từ Optional
	
	// return Tuple(null, non-null)
	private static Optional<Tuple> get(Tuple[] tuples, int element, int numberOfRealValues) {
		Tuple result = null;
		for (int i = 0; i < numberOfRealValues; i++) {
			Tuple tuple = tuples[i];
			if (tuple.getValue() == element) {
				result = tuple;
			}
		}
		// result --> null || non
		return Optional.ofNullable(result);
	}
}