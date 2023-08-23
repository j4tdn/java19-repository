
public class RaiseToPower {
public static void main(String[] args) {
	int result = raiseToPower(2, 3);
	System.out.println("result -> " + result);
	
}
private static int raiseToPower(int base_num, int pow_num) {
	int result = 1;
	for(int i = 0; i < pow_num; i++) {
		result = result * base_num;
		System.out.println(result);
	}
	return result;
}
}
