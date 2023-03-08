package datastructure.object.custom;
//tạo ra kdl --> tạo ra 1 class
public class Item {
	// thuộc tính(biến toàn cục)
	public int id;
	public char name;
	public float price;
	
	
	//Không có kiểu dữ liệu trả về (luôn trả về KDL của class chứa nó)
	//Tên hàm trùng với tên class
	//Hàm khởi tạo mặc định(rỗng)
	public Item() {
		
	}
	
	public Item(int id, char name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	//phương thức
	//biến bên trong phương thức --> biên stoanf cục
	//this đại diện cho biến hiện tại thuộc KDL đối tượng đang gọi
	@Override
	public String toString() {
		return this.id + "," + this.name + "," + this.price;
	}

}
