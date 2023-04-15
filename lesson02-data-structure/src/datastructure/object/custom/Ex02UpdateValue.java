package datastructure.object.custom;

public class Ex02UpdateValue {
     public static void main(String[] args) {
    	 //Toán tử = được dùng để gán giá trị ở vùng nhớ STACK
    	 int a = 5;
    	 int b = 10;
    	 
    	 a = b; //a = 10, b = 10
    	 a = 15;
    	 
    	 System.out.println("a: " + a);  
    	 System.out.println("b: " + 10); 
    	 
    	 Item itA = new Item(1, 'A', 25f);//H4
    	 Item itB = new Item(1, 'B', 35f);//H5
    	 
    	 //In địa chỉ ở stack ra
    	 System.out.println("itA code BEF" +System.identityHashCode(itA));
    	 System.out.println("itB code BEF" +System.identityHashCode(itB));
    	 
    	 // itB.name = 'Z';
    	 //itB.name = 'W';
    	 itA = new Item(3, 'C', 15f); // itA(H6)
    	 itB = itA; // Gán ở STACK itA(H6), itB(H6)
    	 // itA.price = 45;
    	 
    	 System.out.println("itA code AFT" +System.identityHashCode(itA));
    	 System.out.println("itB code AFT" +System.identityHashCode(itB));
    	 
    	 System.out.println("itA: " + itA); // price
    	 System.out.println("itB: " + itB); // price
    	 
    	 
    	 
    	 
    	 
	
    }
}
