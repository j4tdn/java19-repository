package datastructure.object.custom;

public class Item {
public int id;
public char name;
public float price;
    // Hàm khởi tạo mặc định (rỗng)
	// Không có KDL trả về ( luôn trả về KDL của class chứa nó ) 
	// Tên hàm trùng với tên class 
public Item () {
	
}
public Item(int pId, char pName, float pPrice) {
	id = pId;
	name = pName;
	price = pPrice;
}
//thuộc tính(biến toàn cục)
	// phương thức
	// biến bên trong phương thức ->  biến cục bộ 
// this đại diện cho biến hiện tại thuộc KDL đối tượng đang gọi
@Override
	public String toString() {
		return "\n" + this.id + ", " + this.name + ", " + this.price; 
	}
}

