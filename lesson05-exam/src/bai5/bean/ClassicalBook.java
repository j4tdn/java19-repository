package bai5.bean;

public class ClassicalBook extends Book {
	private boolean status;
	
	public ClassicalBook() {
	}

	public ClassicalBook(String id, float price, String publisher, boolean status) {
		super(id, price, publisher);
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString() + "status= " + status + "]";
	}
	
	
	
	
	
}
