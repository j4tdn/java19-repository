package datastructure.object.custom;

// Tạo ra KDL --> Tạo ra 1 class
public class Item {
	// thuộc tính( biến toàn cục )
	public int id;
	public char name;
	public float price;

	// Hàm khởi tạo mặc định ( rỗng )
	// Không có kiểu dữ liệu trả về ( luôn trả về KDL của class chứa nó )
	// Tên hàm trùng với tên class
	public Item() {
		id = 0;
		name = ' ';
		price = 0.0f;

	}

	public Item(int pId, char pName, float pPrice) {
		id = pId;
		name = pName;
		price = pPrice;
	}

	// this là đại diện cho biến hiện tại thuộc KDL đối tượng đang gọi
	@Override
	public String toString() {
		return this.id + "," + this.name + "," + this.price;
	}

	// phương thức:
	// biến bên trong phương thức --> biến cục bộ

}
