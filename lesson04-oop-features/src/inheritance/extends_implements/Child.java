package inheritance.extends_implements;

public class Child extends Granfa implements Father, Mother{

	@Override
	public void coffee() {
		
	}

	@Override
	public void drinkBeer() {
		
	}
	
	@Override
	public void coding() {
		Father.super.coding();
		Mother.super.coding();
		System.out.println("database");
	}
	
}
