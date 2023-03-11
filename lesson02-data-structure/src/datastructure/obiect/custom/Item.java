package datastructure.obiect.custom;

//tạo ra KDL --> Tạo ra 1 class
public class Item {
	// thuộc tính (biến toàn cục)
	public int id;
	public char name;
	public float price;
	
	//hàm khởi tạo mặc định(rỗng)
	// không có KDL trả về(luôn trả về KDL của class chứa nó)
	public Item() {
		
	}
	
	public Item(int pId, char pName, float pPrice) {
		id = pId;
		name = pName;
		price = pPrice;
	}
	
	
	
	// phương thức
	//   biến bên trong trong phương thức --> biến cục bộ
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}

}
