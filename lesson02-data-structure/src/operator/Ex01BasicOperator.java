package operator;

//Format code --> ctrl shift f
public class Ex01BasicOperator {
	public static void main(String[] args) {
		//Toán tử gán 
		
		int a = 6;
		
		a += 2; // a = a + 2
		a *= 2; // a = a * 2
		System.out.println("a --> " +a); //16
		
		//Toán tử 1 ngôi 
		a++; //a = a + 1;
		a--; //a = a - 1;
		
		int b = a++;
		System.out.println("b --> " + b); //16
		
		System.out.println("a2 --> " + a); //17
		//System.out.println("a2++ -->" + a++);
		System.out.println("++a2 --> " + ++a); //18
		
		//Toán tử 1 ngôi - Tiền tố - Hậu tố 
		//Prefix, suffix
		
		//Toán tử so sánh 
		boolean isAEqualsB = (a == b);
		System.out.println("isAEqualsB --> " + isAEqualsB);
		
		boolean isSGreaterThanB = (a > b);
		System.out.println("isSGreaterThanB --> " + isSGreaterThanB);
		
		boolean isAEvenNumber = (a % 2 == 0);
		System.out.println("isAEvenNumber --> " + isAEvenNumber);
		
		boolean isAOddNumer = !isAEvenNumber;
		System.out.println("isAOddNumer --> " + isAOddNumer);

	}

}
