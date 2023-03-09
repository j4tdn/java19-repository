package datastructure.object.custom;

public class Item {
	public int id;
	public char name;
	public float price;
	
	
	public Item(int pId, char pName, float pPrice)
	{
		id = pId;
		name = pName;
		price = pPrice;
	}
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}
}
