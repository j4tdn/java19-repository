package operator;

public class Ex01BasicOperator {
	public static void main(String[] args) {
		//Toán tử gán
		
		int a= 6;
		a +=2;
		a *=2;
		
		//Toán tử 1 ngôi
		
		int x =5;
		int y=2;
		int z =3;
		
		y += y +x++ + z++ + ++z + ++x -y-- +z;
		
		System.out.println(x +" " + y + " "+ z);
	}
}
