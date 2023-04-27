package inheritance.entends_implements;

public class Child extends Granfa implements Father, Mother {
	
	//language design
	// ----> khi 2 pt ở 2 n KDL cha trùng nhau ==> bắt buộc override ở lớp con
	
	@Override
	public void coffee() {
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
