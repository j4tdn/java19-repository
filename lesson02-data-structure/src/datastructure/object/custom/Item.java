package datastructure.object.custom;


// Tạo ra KDL --> Tạo ra 1 class
public class Item {
	// thuộc tính(biến toàn cục)
	public int id;
	public char name;
	public float price;
	
	// Hàm khởi tạo mặc định(Rỗng)
	//ko có kdl trả về(luôn rả về kdl của class chứa nó)
	//Tên hà trùng với tên class
	public Item() {
		//id = 0;
		//name = ' ';
		//price = 0;
		
	}
	// new Item(55 , 'Z',555)
	public Item(int id, char name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	//phương thức
	// biến bên trong phương thức --> biến cục bộ
	// itX.toString --> this = itX
	// itY.toString --> this = itY
	//this đại diện cho biến hiện tại thuộc kdl đối tượng đang gọi
	
 @Override
public String toString() {
	 return this.id + " , " + this.name + " , " + this.price;
	
}
}
