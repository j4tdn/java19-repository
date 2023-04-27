package bai5;

public class ClassicalBook extends Book {
	private boolean statusIsNew;

	public ClassicalBook() {
	}

	public ClassicalBook(String id, double price, String publisher, boolean statusIsNew) {
		super(id, price, publisher);
		this.statusIsNew = statusIsNew;
	}

	public boolean isStatusIsNew() {
		return statusIsNew;
	}

	public void setStatusIsNew(boolean statusIsNew) {
		this.statusIsNew = statusIsNew;
	}

	@Override
	public String toString() {
		return super.toString() + "ClassicalBook [statusIsNew=" + statusIsNew + "]";
	}

}
