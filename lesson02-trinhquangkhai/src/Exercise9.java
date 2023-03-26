
public class Exercise9 {
public static void main(String[] args) {
 Exercise9.songuyento(200);
}
private static void songuyento(int input) {
	int n = 1;
	int dem = 0;
	while(dem < input ) {
		n++;
		if(Exercise8.isPrime(n)) {
			dem++;
		}
		}
	System.out.println("số nguyên tố thứ " +dem+ " là:" +n);
	}
}

