package ex05.model;

public class ReferenceBook extends Book {
	private float tax; // (%)

	public ReferenceBook() {
	}

	public ReferenceBook(String id, double price, String publisher, float tax) {
		super(id, price, publisher);
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [" + super.toString() + ", tax=" + tax + "]\n";
	}
	
	

}
