package datastructure.object.custom;

public class Item {
	public int id;
	public char name;
	public float price;

	public Item() {

	}

	public Item(int id, char name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "\n" + this.id + ", " + this.name + ", " + this.price;
	}
}
