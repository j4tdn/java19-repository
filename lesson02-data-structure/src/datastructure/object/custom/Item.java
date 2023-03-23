package datastructure.object.custom;

//Tạo ra KDL -> Tạo ra class
public class Item {
	// thuộc tính(biến toàn cục)
	public int id;
	public char name;
	public float price;
	// Hàm khởi tạo mặc định(rỗng)
	// KO có KDL trả về(luôn trả về KDL của class chứa nó)
	// Tên hàm trùng với tên class
	public Item() {
		
	}
	public Item(int pId, char pName, float pPrice) {
		id = pId;
		name = pName;
		price = pPrice; 
	}
	
	
	// phương thức 
	// biến bên trong phương thức -> biến cục bộ 
	@Override
	public String toString() {
		return "\n" + this.id + " , " + this.name + "," + this.price;
	}

}
