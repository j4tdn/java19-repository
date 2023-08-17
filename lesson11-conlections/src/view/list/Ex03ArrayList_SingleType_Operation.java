package view.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03ArrayList_SingleType_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> bookIds = mockData();
		
		//add at index
		bookIds.add(2, "SGK-4");
		
		//add[index] the collection to list
		bookIds.addAll(List.of("T1", "T2"));
		
		//remove at index
		bookIds.remove(4);
		
		//remove at value
		bookIds.remove("SGK-1");
		
		//remove by condition
		/* bookIds.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String bookId) {
				return bookId.startsWith("T1");
			}
		});
		*/
		
		//why collection using 'iterator to loop' when code removeIf funtion (tại sao bộ sưu tập sử dụng 'iterator to loop' khi code removeIf chức năng)
		//let's try
		// 2 operations(loop, remove) access bookId concurrent (2 thao tác (loop, remove) truy cập đồng thời bookId)
		// --> throw concurrent modification exception(-> ném ngoại lệ sửa đổi đồng thời)
		// có thể phần tử chưa duyệt đã bị remove rồi
		
		//duyệt tuần tự
		bookIds.removeIf(bookId -> bookId.startsWith("T1"));
		
		printfWithItertor(bookIds);

	}
	
	private static List<String> mockData(){
		List<String> bookIds = new ArrayList<>();
		bookIds.add("SGK-1");
		bookIds.add("SGK-2");
		bookIds.add("SGK-3");
		bookIds.add("STK-1");
		bookIds.add("STK-2");
		bookIds.add("STK-3");
		return bookIds;
	}
	
	private static void printfWithForEach(List<String> elements) {
		// for index, each
		
		// có thể truy cập đến phần tử bất kỳ thậm trí khi chưa duyệt đến
		for (String string : elements) {
			System.out.println(string);
		}
	}
	
	private static void printfWithItertor(List<String> elements) {
		// iterator --> duyệt tuần tự
		// 1 thời điểm chỉ truy cập được 1 phần tử 
		// chỉ cho phép truy cập phần tử thứ k khi iterator duyệt đến phần tử k
		// nếu iterator đang ở phần tử k - x thì không thể truy cập phần tử k đc 
		Iterator<String> iterator = elements.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			
		}
	}
}
