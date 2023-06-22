package ex03;

public class Main {
	public static void main(String[] args) {
        String s = "  Welcome to JAVA10 class";
        System.out.println(revert(s));
    }

    private static String revert(String s) {
        s = s.strip();
        s = s.replaceAll("\\s+"," ");
        String[] arrSplit = s.split(" ");
        String result = "";
        for(String str : arrSplit){
            result+=chainIsland(str)+" ";
        }
        return result.strip();
    }

    private static String chainIsland(String str){
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }
}
