import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
//	String input = "aaaababbbddc";
	Scanner ip = new Scanner(System.in);
	
	System.out.println("Nhập vào một chuỗi: ");
	String input = ip.nextLine();
    findMostFrequentCharacters(input);
    
    
}
public static void findMostFrequentCharacters(String input) {
    int[] charCount = new int[26];

    for (char c : input.toCharArray()) {
        if (Character.isLetter(c)) {
            // Chuyển đổi kí tự thành chữ thường và tính chỉ số tương ứng trong mảng đếm
            int index = Character.toLowerCase(c) - 'a';
            charCount[index]++;
        }
    }

    int maxCount = 0;

    for (int count : charCount) {
        if (count > maxCount) {
            maxCount = count;
        }
    }

    System.out.print("Kí tự xuất hiện nhiều nhất trong chuỗi là: ");
    for (int i = 0; i < charCount.length; i++) {
        if (charCount[i] == maxCount) {
            char mostFrequentChar = (char) (i + 'a');
            System.out.print("\"" + mostFrequentChar + "\" ");
        }
    }
}
}

