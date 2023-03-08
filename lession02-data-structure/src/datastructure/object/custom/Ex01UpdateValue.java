package datastructure.object.custom;

public class Ex01UpdateValue {
	public static void main(String[] args) {
		
		//Toán tử = được dùng để gán giá trị ở vùng stack
		
		int a = 5;
		int b= 10;
		
		 a= b;
		 a = 15;
		 
		 System.out.println("a : " + a);
		 System.out.println("b : " + b);
		 
		 Item itA = new Item(1, "A", 5);
		 Item itB = new Item(2, "B", 99);
		 
		 System.out.println("Hash Code A 1: " + itA.hashCode());
		 System.out.println("Hash Code A 2: " + System.identityHashCode(itA));
		 System.out.println(System.identityHashCode(itB));
		 
		 itB = new Item(3,"C",15f);
		 itA =itB; //Toán tử = luôn gán ở STACK
		 // địa chỉ vùng nhớ A bằng với địa chỉ vùng nhớ B, gán địa chỉ vùng nhớ B cho A 
		 			//-> khi truy cập đến sẽ bằng với giá trị giống với của itB
		 
		 System.out.println(itA.hashCode());
		 System.out.println(System.identityHashCode(itB));
		 
		 System.out.println(itA);
		 
//		 itA.id= 45;
		 
		 System.out.println(itB);
		 System.out.println(itB);
		 
	}
}
