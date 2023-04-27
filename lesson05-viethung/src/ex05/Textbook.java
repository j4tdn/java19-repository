package ex05;

public class Textbook extends Book{
	private boolean status;

	public Textbook(int id, float price, String author, boolean status) {
		super(id, price, author);
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
		return "\n" + super.toString() + ", " + getStatus() + "]";
	}
}
