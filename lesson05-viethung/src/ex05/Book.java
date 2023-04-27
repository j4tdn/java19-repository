package ex05;

public class Book {
	private int id;
	private float price;
	private String author;
	public Book() {};
	public Book(int id, float price, String author) {
		super();
		this.id = id;
		this.price = price;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", author=" + author;
	}
}
