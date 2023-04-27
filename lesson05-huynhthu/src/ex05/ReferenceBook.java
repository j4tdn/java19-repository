package ex05;

public class ReferenceBook extends Book{
	private double tax;
	
    public ReferenceBook() {
	}

	public ReferenceBook(String id, int price, String author, double d) {
		super(id, price, author);
		this.tax = d;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return super.toString() + ", Tax= " + tax + "%}\n";
	}
    
}
