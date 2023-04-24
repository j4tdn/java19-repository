package inheritance.extends_implements;

public class Child extends GrandFa implements Father, Mother {
	@Override
	public void drinkBeer() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void coffee() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void coding() {
		// TODO Auto-generated method stub
		Father.super.coding();
		Mother.super.coding();
		System.out.println("database");
	}
}
