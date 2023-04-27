package ex05;

public class ReferenceBook extends Book{
	private float tax;

	public ReferenceBook(int id, float price, String author, float tax) {
		super(id, price, author);
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
		return "\n" +  super.toString() + ", " + getTax() + "]";
	}
}
