package datastructure.object.custom;

public class Item {
	public int id;
	public String name;
	public float price;
	public Item() {
		
	}
	public Item(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.name + " " +this.price;
	}
}
