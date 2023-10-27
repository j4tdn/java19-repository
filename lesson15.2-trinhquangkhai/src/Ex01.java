import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	int wrongAttemp = 0;
	 
	while(wrongAttemp <= 3) {
	 System.out.println("Nhập vào số thực có phần thập phân khác không: ");
	 float input = ip.nextFloat();
	 if(input != (float) input) {
		 System.out.println("Số bạn nhập vào không phải số thực!. Vui lòng nhập lại: ");
		 wrongAttemp++;
	 }else {
		 int numerator = 1;
		 int denominator = 1;
		 int fraction = numerator/denominator;
		 while(true) {
		 if(fraction > input) {
			 denominator += 1;
			 
		 }else if (fraction < input){
			 numerator += 1;
		 }else if (fraction == input) {
			 System.out.println("phân số tối giản của số thập phân " + input + " là: " + numerator + "/" + denominator);
			 break;
		 }
		
		 
	 }}
	 
 }
	System.out.println("Bạn đã nhập sai quá 3 lần. Kết thúc chương trình");
	System.exit(0);
	}}

	


