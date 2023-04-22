package inheritance.basics;

public class ClassicalBook extends Book{
	private boolean isNew;
	
	public boolean isNew() {
		return isNew;
	}

	public ClassicalBook(int id, String name, double price, String publisher, boolean isNew) {
		super(id, name, price, publisher);
		this.isNew = isNew;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", isNew= " + isNew + "\n" ;
	}
	
}
