
public class bai3 {
	public static void main(String[] args) {
		System.out.println(getMaxValidNumber("12abu02muzk586cyx"));
		System.out.println(getMaxValidNumber("Uyk892nn1234uxo2"));
		
	}
	
	public static int getMaxValidNumber(String number) {
		String numberTemp = "";
		int max = 0;
		for(int i = 0; i<number.length(); i++) {
			if (!Character.isLetter(number.charAt(i))) {
				numberTemp += number.charAt(i);
            }
			else {
				if( numberTemp.length()>0)
					if( max < Integer.parseInt(numberTemp) ) {
						max = Integer.parseInt(numberTemp);
					}
				numberTemp = "";
			}
		}
		return max;
	}
}
