package controlling;

public class Ex02For {
	public static void main(String[] args) {
		// B1: in ra ds cac so nguyen duong < 20--> [0, 20)
		// int = 0 ---> bieeru thuwsc khowri taoj chay 1 lan duy nhat
		for (int i = 0; i < 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n===========\n");

		// B2: in ra danh sach cac so laf bội của 7 và nhỏ hơn 50
		for (int i = 0; i < 50; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");

			}
		}
	}
}
