package view;

public class ReferBook extends Book {
	private double taxPercentage;

	public ReferBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferBook(String bookCode, double price, String publisher, double taxPercentage) {
		super(bookCode, price, publisher);
		this.taxPercentage = taxPercentage;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	@Override
	public String toString() {
		return super.toString() + "ReferBook [taxPercentage=" + taxPercentage + "]";
	}

}
