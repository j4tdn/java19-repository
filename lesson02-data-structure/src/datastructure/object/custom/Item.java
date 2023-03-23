package datastructure.object.custom;

public class Item {
	// thuộc tính(biến toàn cục)
	public int id;
	public char name;
	public float price;
	
	
	// hàm khởi tạo mặc định
	// không có kiểu dữ liệu trả về (luôn trả về KDL của class chứa nó)
	// tên hàm trùng với tên class
	
	public Item() {
		
	}
	
	public Item(int pId, char pName, float pPrice) {
		id=pId;
		name=pName;
		price=pPrice;
	}
	
	
	// phương thức
	//
	@Override
	public String toString() {
		return "\n" + this.id+", "+this.name+", "+this.price;
		
	}
}
