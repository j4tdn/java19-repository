package string.immutable;


/*
 Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
 Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
 Loại bỏ các khoảng trắng thừa của chuỗi s3
 Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
 Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 */
public class Ex04StringDemo02 {
	public static void main(String[] args) {
		String[] sequences = {"SGK123", "STKxy12", "SGK999", "STK115"};
		
		//1. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		System.out.println(sequences[0]+ " starts with " + sequences[0].startsWith("SGK"));
		System.out.println(sequences[0]+ " ends with " + sequences[0].endsWith("123"));
		System.out.println(sequences[1]+ " starts with " + sequences[1].startsWith("SGK"));
		
		System.out.println("===========================================================");
		
		// 2.Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		String s = "    welcome    to   string lesson     ";
		System.out.println("Replacement --> " + s.replace("string", "char-sequence"));
		System.out.println("Space Replacement --> " + s.replaceAll("\\s+", " "));
		
		// 3.Loại bỏ các khoảng trắng thừa của chuỗi s3
		
		System.out.println("Removed Redundant  Space");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
