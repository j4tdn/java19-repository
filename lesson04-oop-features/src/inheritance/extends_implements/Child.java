package inheritance.extends_implements;

public class Child extends Granfa implements Father, Mother{
	
	// language design
	// ---> khi 2 pt ở 2 n KDL cha trùng nhau ==> bắt buộc override ở lớp con
	
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
	}
	
	
}
