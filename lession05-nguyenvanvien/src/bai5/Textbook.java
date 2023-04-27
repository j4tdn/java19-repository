package bai5;

public class Textbook extends Book{
	
	@Override
	public String toString() {
		return "Textbook [status=" + status + ", toString()=" + super.toString() + "]";
	}

	private boolean status;
	
	public Textbook(String idBook, double prices, String publisher, boolean status) {
		super(idBook, prices, publisher);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
}
