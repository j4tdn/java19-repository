package inheritance.basic;

public class ClassicalBook extends Book{
	
	// super --> tt, hàm của cha
	// this  --> tt, hàm của hiện tại(gồm những tt, hàm của lớp cha cho phép thừa kế)
	
	private boolean isNew;
	
	public ClassicalBook() {
	}
	
	// new ClassicalBook(1, "B1", "ND", true);
	public ClassicalBook(int id, String name, String publisher, boolean isNew) {
		super(id, name, publisher);
		this.isNew = isNew;
	}
	
	public boolean isNew() {
		return isNew;
	}
	
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	
	@Override
	public String toString() {
		return "{" + super.toString() + ", isNew = " + isNew + "}\n";
	}
	
}
