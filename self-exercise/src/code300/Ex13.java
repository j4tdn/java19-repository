package code300;

public class Ex13 {
public static void main(String[] args) {
	String s = "ab#c";
	String t = "ad#c";
	System.out.println(backspaceCompare(s, t));
	
}
public static boolean backspaceCompare(String s, String t) {
	
	for(int i = 0; i < s.length(); i++) {
		char newS = s.charAt(i);
		//char newChar = '#';
		if(newS == '#') {
			s = removeCharacterAndPreceding(s, i);
			s = removeCharacterAndPreceding(s, i-1);
		}
	}
	System.out.println(s);
	for(int i = 0; i < t.length(); i++) {
		char newS = t.charAt(i);
		//char newChar = '#';
		if(newS == '#') {
			t = removeCharacterAndPreceding(t, i);
			t = removeCharacterAndPreceding(t, i-1);
		}
	}
	
	System.out.println(t);
	if(s.equals(t)) {
		return true;
	}else {
		return false;
	}
}
private static String removeCharacterAndPreceding(String str, int position) {
    // Kiểm tra xem vị trí có hợp lệ không
    if (position > 0 && position < str.length()) {
        // Sử dụng substring để tạo chuỗi mới bằng cách loại bỏ kí tự và vị trí trước đó
    	// substring cắt từ vị trí beginIndex -> endIndex -1 
        return str.substring(0, position) + str.substring(position+1);
    } else {
        // Trả về chuỗi ban đầu nếu vị trí không hợp lệ
        return str;
    }
}
}
