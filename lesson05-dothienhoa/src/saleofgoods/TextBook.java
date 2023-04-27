package saleofgoods;

public class TextBook extends Book{
	private boolean isNew ;

	public TextBook() {
	}

	public TextBook(String id, double price, String publisher, boolean isNew) {
		super(id, price, publisher);
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
		return "TextBook [isNew=" + isNew + ", toString()=" + super.toString() + "]\n";
	}
	
	
}
