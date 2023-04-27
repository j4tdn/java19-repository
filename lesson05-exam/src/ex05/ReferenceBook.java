package ex05;

public class ReferenceBook extends Book {
	
private double tax;
	
	public ReferenceBook() {
	}

	
	
	public ReferenceBook(int id, double dongia, String publisher, double tax) {
		super(id, dongia, publisher);
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
		return "{"+super.toString() + ", tax = " + tax + "(%)}\n";
	}


}
