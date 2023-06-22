package immutable;

public class Ex03StringDemo01 {
/*  1.Tính chiều dài của chuỗi s
	2.Nối chuỗi s1 vào chuỗi s
	3.Lấy một ký tự tại vị trí index(3) trong chuỗi s
	4.Duyệt từng kí tự và từ trong chuỗi
	5.Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự “a” trong chuỗi s
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello word, my name is teo";
		String s1 = "a, nice to see you all";
		
		//1.Tính chiều dài của chuỗi s
		System.out.println("s1 lenght: " + s1.length());
		//2.Nối chuỗi s1 vào chuỗi s
		System.out.println("s + concat: " + s.concat(s1));
		//3.Lấy một ký tự tại vị trí index(3) trong chuỗi s
		System.out.println("s charAt: " + s.charAt(3));
		//4.Duyệt từng kí tự và từ trong chuỗi
		loopChars(s.concat(s1));
		loopWord(s.concat(s1));
		//5.Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự “a” trong chuỗi s
		System.out.println("s1 indexOf: " + s1.indexOf('a'));
		System.out.println("s1 lastIndexOf : " + s1.lastIndexOf('a'));
	}
	
	private static void loopChars(String s) {
		System.out.println("4.Duyệt từng kí tự");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + "-");
		}
		System.out.println();
	}
	
	private static void loopWord(String s) {
		System.out.println("4.Duyệt từng từ");
		String[] words = s.split("[\\s,]+");
		for(String word : words) {
			System.out.println(word);
		}
	}

}
