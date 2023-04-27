package ex05;

public class Book {
	
	private int id;
	private double dongia;
	private String publisher;

	public Book() {
	}

	public Book(int id, double dongia, String publisher) {
		super();
		this.id = id;
		this.dongia = dongia;
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", dongia=" + dongia + ", publisher=" + publisher + "]";
	}

	
	
	
	
	
	
	
}
