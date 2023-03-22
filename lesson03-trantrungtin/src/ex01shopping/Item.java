package ex01shopping;

public class Item {
	private String id;
	private String color;
	private String os;
	private double price;
	

	public Item(String id, String color, String os, double string) {
		this.id = id;
		this.color = color;
		this.os = os;
		this.price = string;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
