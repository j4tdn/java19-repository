package inheritance.extends_implements;

public class Child extends Granfa implements Father, Mother{
	
	// language design
	// --> khi 2 phương thwusc ở 2 KDL cha trùng nhau --> bắt buộc override ở lớp con
	
	@Override
	public void coffee() {
		
	}
	@Override
	public void drinkBeer() {
		
	}
	
	@Override
	public void coding() {
		// TODO Auto-generated method stub
		Father.super.coding();
		Mother.super.coding();
		System.out.println("database");
	}
}
