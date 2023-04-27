package view;

public class TextBook extends Book {
	private boolean isNew;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String bookCode, double price, String publisher, boolean isNew) {
		super(bookCode, price, publisher);
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
		return super.toString() +"TextBook [isNew=" + isNew + "]";
	}
	
	
}
