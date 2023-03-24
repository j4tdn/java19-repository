package view;

public class Ex01App {
	public static void main(String[] args) {
		System.out.println(solution("OXXXOXOOX"));
		System.out.println(solution("XOXXXOOOXOOO"));
		System.out.println(solution("XX"));
		System.out.println(solution("XXOOOOOXX"));
	}
	public static String solution(String S) {
		if (S.length() < 3) return "tie";
        char winningPlayer = '\0';  
        int count = -1;
        for (int i = 0; i < S.length() - 2; i++) {
            char curr = S.charAt(i);
            if (curr == S.charAt(i+1) && curr == S.charAt(i+2)) {
            	if(winningPlayer != curr) count++;
            	winningPlayer = curr;
            }
        }
        if (count > 0) {
            return "tie";
        } else {
            return String.valueOf(winningPlayer);
        }
    }
}
