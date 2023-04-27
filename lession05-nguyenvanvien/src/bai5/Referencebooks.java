package bai5;

public class Referencebooks extends Book{

	private float tax;
	public Referencebooks(String idBook, double prices, String publisher, float tax) {
		super(idBook, prices, publisher);
		this.tax = tax;
	}
	public float getTax() {
		return tax;
	}
	@Override
	public String toString() {
		return "Referencebooks [tax=" + tax + ", toString()=" + super.toString() + "]";
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	
}
