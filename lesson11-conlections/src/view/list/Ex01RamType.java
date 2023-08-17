package view.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ex01RamType {
	/*
	 List: tên của interface
	 <E>: tham số của interface list
	 		--> sử dụng , gọi interface list --> truyền giá trị cho tham số E
	 		tham số E nhận vào 1 kiểu dữ liệu đối tượng 
	 		
	 VD: Lưu danh sách các số nguyên --> List<Interger>
	 
	 public interface list<E>
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 p1 --> raw type(kiểu thô)
		 no pass generic --> default object
		 + add values with arbitrary types (thêm giá trị với các loại tuỳ ý)
		 + compile --> oke
		 + run time: cause casting error at runtime(cause casting error at runtime)
		 */
		
		List rawTypeList = new ArrayList();
		rawTypeList.add(1);
		rawTypeList.add(2);
		rawTypeList.add(3);
//		rawTypeList.add("hai");
		rawTypeList.add(BigDecimal.valueOf(15));
		
		for (Object object : rawTypeList) {
			int newValue = Integer.parseInt(object.toString()) - 1;
			System.out.println(object + "--->" + newValue);
		}
		
		
		/*
		 p2 --> generic type from JDK 1.5
		 		1.5 new ArrayList<Integer>()
		 		1.7 new ArrayList<>()
		 		--> support catch error at compile time(hỗ trợ bắt lỗi lúc biên dịch)
		 		+ error management(quản lý được lỗi)
		 		+ avoid unexpected error at runtime(tránh lỗi không mong muốn khi chạy)
		 */
		
		List<Integer> genTypeList = new ArrayList<>();
		genTypeList.add(4);
		genTypeList.add(7);
		genTypeList.add(8);
//		genTypeList.add("hai");
		for (Integer integer : genTypeList) {
			int newValue = integer - 1;
			System.out.println(integer + "--->" + newValue);
			
		}

	}

}
