package datastructure.object.custom;

// Tạo ra KDL --> Tạo ra 1 class
public class Item {
	// thuộc tính (biến toàn cục)
	public int id;
	public char name;
	public float price;
	/*	
	// Hàm khởi tạo mặc định (rỗng)
	// Ko có KDL trả về (mặc định trả về kiểu dữ liệu là class chứa nó (Item))
	// Tên hàm trùng với tên class
	// không cần khai báo nếu ko override

	public Item() {
		
	}
	 */
	public Item() {
		// id = 0;
		// name = ' ';
		// price = 0;
	}
	
	public Item(int pId, char pName, float pPrice) {
		id = pId;
		name = pName;
		price = pPrice;
	}
	
	// phương thức
	// biến bên trong phương thức --> biến cục bộ
	
	//itX.toString --> this = itX
	//itY.toString --> this = itY
	// this đại diện cho biến hiện tại thuộc KDL đối tượng đang gọi
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return this.id + ", " + this.name + ", " + this.price + "\n";
	}
	
}
