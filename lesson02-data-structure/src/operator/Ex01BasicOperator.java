package operator;

public class Ex01BasicOperator {
	public static void main(String[] args) {
		// set operator
		int a = 6;
		a += 2;
		a *= 2;

		System.out.println("a1: " + a);

		// toan tu 1 ngoi
		// prefix: +, - --> use value
		// suffix: use value --> +,-
		a++;
		a--;
		
		int b = a++;

		System.out.println("a2: " + a);

		System.out.println("a2++: " + a++);
		
		//compare operator
		
		boolean isAEqualsB = (a == b);
		System.out.println("isSEqualsB: " + isAEqualsB);
		
		boolean isAGreaterThanB = (a > b);
		System.out.println("isAGreaterThanB: " + isAGreaterThanB);
		
		boolean isAEvenNumber = (a % 2 == 0);
		System.out.println("isAEvenNumber: " + isAEvenNumber);
		
		boolean isAOddnumber = !isAEvenNumber;
		System.out.println("isAOddNumber: " + isAOddnumber);
		
		//&&  &  ||  ?:
	}
}
