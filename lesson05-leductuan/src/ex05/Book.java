package ex05;

public class Book {
<<<<<<< HEAD
	
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
=======
	 String id;
     double price;
     String publisher;

    public Book(String id, double price, String publisher) {
        this.id = id;
        this.price = price;
        this.publisher = publisher;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
>>>>>>> f17414c (lesson05-exam-leductuan27/04/2023)
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

<<<<<<< HEAD
	@Override
	public String toString() {
		return "Book [id=" + id + ", dongia=" + dongia + ", publisher=" + publisher + "]";
	}

	
	
	
	
	
	
	
=======

>>>>>>> f17414c (lesson05-exam-leductuan27/04/2023)
}
