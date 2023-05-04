package datastructure.object.custom;

// Tạo ra KDL --> Tạo ra 1 class
public class Item { // Item it1 = ...;
	// thuộc tính(biến toàn cục)
	public int id;
	public char name;
	public float price;
	
	// Hàm khởi tạo mặc định(rỗng)
	// Ko có KDL trả v�?(luôn trả v�? KDL của class chứa nó)
	// Tên hàm trùng với tên class
	public Item() {
		// id = 0;
		// name = ' ';
		// price = 0.0f;
	}
	
	//  new Item(55, 'Z', 555);
	// this: ô nhớ hiện tại đang khởi tạo
	public Item(int id, char name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	// phương thức
	//   biến bên trong trong phương thức --> biến cục bộ
	// itX.toString --> this = itX
	// itY.toString --> this = itY
	// this đại diện cho biến hiện tại thuộc KDL đối tượng đang g�?i
	@Override
	public String toString() {
		return "\n" + this.id + ", " + this.name + ", " + this.price; 
	}
}
