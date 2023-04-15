package datastructure.object.custom;

//Tạo ra KDL --> Tạo ra 1 class
public class Item {
    // thuộc tính (biến toàn cục)
	public int id;
	public char name;
	public float price;
	
	// Hàm khởi tạo mặc định (rỗng)
	// Ko có KDL trả về (luôn trả về KDL của class chứa nó)
	// Tên hàm trùng với tên class
	public Item() {
		
	}
	//thís: ô nhớ hiện tại đang khởi tạo
	public Item(int id, char name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	// phương thức
	// biến bên trong phương thức --> biến cục bộ
    // itX.toString --> this = itX
	// itY.toString --> this = itY
	// this đại diện cho biến hiện tại thuộc KDL đối tượng đang gọi
	@Override
    public String toString() {
    	return "\n" + this.id + ", " + this.name + ", " + this.price;
    }
}
