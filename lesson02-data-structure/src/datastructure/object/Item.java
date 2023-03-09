package datastructure.object;

// Tạo ra KDL --> Tạo ra 1 class
public class Item {
	// thuộc tính (biến toàn cục) --> thuộc phạm vi class
	public int id;
	public char name;
	public float price;
	
	public Item() {
		
	}
	
	// Hàm khởi tạo mặt định (rỗng)
	// Ko có KDL trả về (luôn trả về KDL của class chứa nó)
	// Tên hàm trùng với tên class
	public Item(int pId, char pName, float pPrice) {
		id = pId;
		name = pName;
		price = pPrice;
	}

	// phương thức 
	// biến bên trong phương thức --> biến cục bộ
	
	
	// This --> đại diện cho biến hiện tại thuộc KDL đối tượng đang gọi
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}
}
