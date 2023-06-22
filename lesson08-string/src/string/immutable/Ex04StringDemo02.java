package string.immutable;

public class Ex04StringDemo02 {
   public static void main(String[] args) {
	String[] sequences = {"SGK123", "STKxy12", "SGK999", "STK115"};
	//1 kiem tra s1 co phai la chuoi bat dau || ket thuc trong chuoi s khonh
	System.out.println(sequences[0] + " starts with--> " + sequences[0].startsWith("SGK"));
	System.out.println(sequences[0] + " ends with--> " + sequences[0].endsWith("123"));
	System.out.println("\n==========\n");
	//thay the
	String s = "welcome  to    string   lesson  ";
	System.out.println("Replacement --> " + s.replace("string", "char-sequence"));
    System.out.println("Space Replacement --> " + s.replaceAll("\\s+", " "));
	System.out.println("\n==========\n");
	//loai bo khoang trang thua
	System.out.println("Removed Redundant Spaces -->" + s.strip().replaceAll("\\s+", " "));
	System.out.println("\n==========\n");

	// tao chuoi con cua chuoi s bat dau tu vi tri so 2 substring = [a, b)
	s = s.strip();
	int firstSpaceIndex = s.indexOf(" ");
	System.out.println("Sub string --> " + s.substring(2, firstSpaceIndex));
	
	//xac dinh chuoi s2 co ton tai trong chuoi s1 khong
	System.out.println("Contains --> "+ s.contains("lesson23"));
	

    
  }
}
