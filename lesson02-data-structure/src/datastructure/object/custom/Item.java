package datastructure.object.custom;

public class Item {
	// thuoc tinh(bien toan cuc)
	
	public int id;
	public char name;
	public float price;
	
	//ham khoi tao mac dinh(rong)
	public Item() {
		
	}
	public Item(int pId, char pName, float pPrice ) {
		id = pId;
		name = pName;
		price = pPrice;
	}
	@Override
	public String toString() {
		
		return this.id + "," + this.name +","+ this.price;
	}
	
	//phuong thuc
	//ko co kdl tra ve(luon tra ve kieu du lieu cua class chua no)
	//ten ham trung voi ten class
	//bien ben trong phuong thuc --> bien cuc bo
}
