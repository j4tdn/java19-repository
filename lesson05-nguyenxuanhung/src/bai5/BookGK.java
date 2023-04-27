package bai5;

public class BookGK extends Book{
	private String condition;
	
	public BookGK() {
		// TODO Auto-generated constructor stub
	}
	public BookGK(String id, double price, String publisher, String condition) {
		super(id, price, publisher);
		this.condition = condition;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	@Override
	public String toString() {
		return super.toString() + ", condition=" + condition + "]";
	}
	
	@Override
	public double calcPrice() {
		if(this.condition != "new") {
			return this.price*70/100;
		}
		return this.price;
	}
}
