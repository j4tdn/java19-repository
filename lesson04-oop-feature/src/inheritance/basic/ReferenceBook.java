package inheritance.basic;

public class ReferenceBook extends Book {
	private double tax; //unit: %
	
	public ReferenceBook() {
	
	}

	public ReferenceBook(int id, String name, String publisher, double tax) {
		super(id, name, publisher);
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
		return "ReferenceBook [tax=" + tax + ", toString()=" + super.toString() + ", tax  =" + tax +"(%)";
	}
	
	
}
