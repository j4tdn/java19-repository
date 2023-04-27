package ex05;

public class ClassicalBook extends Book {
     private boolean isNew;
     
     public ClassicalBook() {
	}

	public ClassicalBook(String id, int price, String author, boolean isNew) {
		super(id, price, author);
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
		return super.toString() + ", isNew= " + isNew +"}\n";
	}
     
}
