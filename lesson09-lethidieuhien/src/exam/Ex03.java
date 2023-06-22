package exam;

public class Ex03 {
	public static void main(String[] args) {
		 Ex03 obj = new Ex03();
	     obj.reverseWordInMyString("Welcome  to JAVA10 class");
	}
	public void reverseWordInMyString(String str)
    {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString.replaceAll("  ", " "));
        
    }
}
