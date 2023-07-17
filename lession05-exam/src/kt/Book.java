package kt;

public class Book {
	private String idBook;
	private double prices;
	private String publisher;
	
	
	public Book(String idBook, double prices, String publisher) {
		this.idBook = idBook;
		this.prices = prices;
		this.publisher = publisher;
	}
	public String getIdBook() {
		return idBook;
	}
	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}
	public double getPrices() {
		return prices;
	}
	public void setPrices(double prices) {
		this.prices = prices;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", prices=" + prices + ", publisher=" + publisher + "]";
	}
}
