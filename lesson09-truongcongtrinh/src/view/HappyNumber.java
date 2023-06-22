package view;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappyNumber(32));
	}

	private static boolean isHappyNumber(int number) {
		StringBuilder sb = new StringBuilder();
        while (true) {
            int res = 0;
            while (number > 0) {
                res += ((number % 10) * (number % 10));
                number /= 10;
            }
            number = res;
            if (res == 1)
                return true;
            if (sb.indexOf("." + res) == -1) {
                sb.append("." + res);
            } else
                return false;
        }
	}
}
