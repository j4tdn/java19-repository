package controlling;

public class Ex03BreakContinue {
	public static void main(String[] args) {
		System.out.println("--------------------Break----------------------------");
		for (int i = 1; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.print(i + " ");
		}
		
		System.out.print("\n--------------------Continue-------------------------\n");
		
		for (int i = 1; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
