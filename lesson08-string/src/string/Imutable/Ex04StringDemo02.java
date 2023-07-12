package string.Imutable;

/**
	Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
	Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
	Loại bỏ các khoảng trắng thừa của chuỗi s3
	Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
	Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 */

public class Ex04StringDemo02 {
	public static void main(String[] args) {
		String[] sequences = {"SKG123", "SGKxy12", "SGK999", "SGK115"};
		
		//Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		System.out.println(sequences[0] + " starts with -->>" + sequences[0].startsWith("SGK"));
		System.out.println(sequences[0] + " end with-->>" + sequences[0].endsWith("123"));
		System.out.println(sequences[1] + " starts with -->>" + sequences[1].startsWith("SGK"));
		System.out.println("=========================");
		//Thay thees
		String s = "welcome   to   string   lesson";
		System.out.println("Replacement --> " + s.replace("string", "char-sequence"));
		System.out.println("Space replacement --> " + s.replaceAll("\\s+", " "));
		
		//Loại bỏ các khoảng trắng thừa của chuỗi s3
		System.out.println("Remove redundant spaces --> " + s.strip().replaceAll("\\s+", " "));
		System.out.println("=========================");
		
		//Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		s = s.strip();
		int firstSpaceIndex = s.indexOf(" ");
		System.out.println("Sub string --> " + s.substring(3, 7));
		
		//Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("Contains --> " + s.contains("lesson"));
	}
}
