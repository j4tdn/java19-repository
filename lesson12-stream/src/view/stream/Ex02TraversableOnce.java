package view.stream;

import java.util.List;
import java.util.stream.Stream;

public class Ex02TraversableOnce {
	
	public static void main(String[] args) {
		
		// Khởi tạo stream
		
		// Cách 1: Từ source(array, collection)
		Stream<String> streamFromSource = List.of("a", "b", "c", "d").stream();
		
		// Cách 2: Dùng hàm stream.of (ít khi dùng)
		Stream<String> stream = Stream.of("X", "Z", "K", "Y");
		
		// Sử dụng stream, cho phép duyệt 1 lần duy nhất
		// Là lý do vì sao sau khi xử lý xong kết quả mình sẽ ko lưu trữ trong stream
		
		streamFromSource.forEach(System.out::println);
		streamFromSource.forEach(System.out::println); // stream has already been operated upon or closed
		
		System.out.println("\n*** ============ ***\n");
		
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);  // stream has already been operated upon or closed
	}
	
}
