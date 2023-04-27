package bai5;

public class BookTK extends Book{
	private double tax;
	
	public BookTK() {
		// TODO Auto-generated constructor stub
	}

	public BookTK(String id, double price, String publisher, double tax) {
		super(id, price, publisher);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return super.toString() + ", tax=" + tax + "]";
	}
	
	@Override
	public double calcPrice() {
		return this.price*(1+tax);
	}
	
}

