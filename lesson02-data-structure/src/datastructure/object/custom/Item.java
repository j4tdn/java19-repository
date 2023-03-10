package datastructure.object.custom;

public class Item {
	// thuộc tính (biến toàn cục)
	public int id;
	public char name;
	public float price;
	// Hàm khởi tạo mặc định (rỗng)
	// Ko có KDL trả về (luôn trả về KDL của class chứa nó)
	public Item() {
		
	}
	
	public Item(int pId, char pName, float pPrice) {
		id = pId;
		name = pName;
		price = pPrice;
	}
	// phương thức
	// biến bên trong phương thức --> biến cục bộ
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ", " + this.name + ", " + this.price + "\n";
	}
}
