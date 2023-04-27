package view;

public class Book {
	private String bookCode;
	private double price;
	private String publisher;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookCode, double price, String publisher) {
		super();
		this.bookCode = bookCode;
		this.price = price;
		this.publisher = publisher;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", price=" + price + ", publisher=" + publisher + "]";
	}

}
