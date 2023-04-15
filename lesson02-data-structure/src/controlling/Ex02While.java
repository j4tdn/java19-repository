package controlling;

public class Ex02While {
	public static void main(String[] args) {
		// B2: in ra danh sach cac so laf bội của 7 và nhỏ hơn 50
		
		
		int i = 0;
		while(i < 50) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
			i++;
			
		}
		System.out.println("Exit wwhile condition... \n");
		i = 0;
		// chayj mai
		while(true) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
			i++;
			// dk dừng
			if (i ==50) {
				break;
			}
		}
		
	}
}
