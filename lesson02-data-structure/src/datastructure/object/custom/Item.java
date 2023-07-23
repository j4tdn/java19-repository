package datastructure.object.custom;

// Tạo ra KDL --> Tạo ra class
public class Item {// Item it1 = ...;
	// thuộc tính(biến toàn cục)
	public int id;
	public char name;
	public float price;
	
	//Hàm khởi tạo mặc định(rỗng)
	// ko có KDL trả về(luôn trả về KDL của class chứa nó)
	// Tên hàm trùng với tên class
	public Item() {
	//id = 0;
	//name = ' ';
	//	price = 0.f;
		
		
	}
	public Item(int pId, char pName, float pPrice) {
		id = pId;
		name = pName;
		price = pPrice;
		
	}
	
	// phương thức
	// biến bên trong phương thức --> biến cục bộ
	//itX.tostring --> this = itX
	//itY.tostring --> this = itY
	//this là đại diện cho biến  hiện tại thuộc KDL đối tượng đang gọi
	@Override
	public String toString() {
		
		return "\n" +this.id + ", " + this.name + ", " + this.price;
	}

}
