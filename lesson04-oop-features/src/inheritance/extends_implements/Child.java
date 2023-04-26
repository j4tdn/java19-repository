package inheritance.extends_implements;

public class Child extends Grandfa implements Father, Mother{
  
	// language design
	// --> khi 2 pt o 2 n KDL cha trung nhau ==> bat buoc override
  // o lop con
	@Override
	public void drinkBeer() {		
	}
	
	@Override
public void coffee() {
	
}
	@Override
	public void coding() {
		Father.super.coding();
		Mother.super.coding();
		System.out.println("database");
	}
}
