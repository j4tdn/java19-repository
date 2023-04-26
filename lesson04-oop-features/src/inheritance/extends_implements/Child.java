package inheritance.extends_implements;

public class Child extends GrandFather implements Father, Mother{

	@Override
	public void coffe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drinkBeer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coding() {
		Father.super.coding();
		Mother.super.coding();
		System.out.println("database");
	}

}
