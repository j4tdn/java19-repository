package bai5.bean;

public class ReferenceBook extends Book {
	private float tax;

	public ReferenceBook() {
	}

	public ReferenceBook(String id, float price, String publisher, float tax) {
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
		return super.toString() + "tax= " + tax + "]";
	}
	
}
