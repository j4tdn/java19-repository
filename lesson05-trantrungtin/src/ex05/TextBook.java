package ex05;

public class TextBook extends Book {
	private boolean isNew;
	
	public boolean isNew() {
		return isNew;
	}
	
	public TextBook(String id, double price, String publisher, boolean isNew) {
		super(id, price, publisher);
		this.isNew = isNew;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", isNew= " + isNew + "\n" ;
	}
}
