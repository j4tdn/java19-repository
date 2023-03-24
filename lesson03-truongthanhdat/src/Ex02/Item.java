package Ex02;

public class Item {
	private int id;
	private String os;
	private String color;
	private double cost;
	
	public Item() {
	}

	public Item(int id, String os, String color, double cost) {
		super();
		this.id = id;
		this.os = os;
		this.color = color;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", os=" + os + ", color=" + color + ", cost=" + cost + "]";
	}
	
	
}
