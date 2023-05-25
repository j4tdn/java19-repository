package inheritance.extends_implements;

public class Child extends Grandfa implements Father,Mother{

	@Override
	public void drinkBeer() {
		
	}

	@Override
	public void coffe() {
		
		
	}
	
	@Override
	public void coding() {
		
		Father.super.coding();
		Mother.super.coding();
		System.out.println("database");
	}
 
}
