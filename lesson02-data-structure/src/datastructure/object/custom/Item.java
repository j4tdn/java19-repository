package datastructure.object.custom;

//create data type --> create class
public class Item {
		//attribute --> biến toàn cục ( dùng trong toàn class)
		public int id;
		public char name;
		public float price;
		
		//default Constructor 
		//have no return data
		//Constructor name is the same as class name
		public Item() {
			
		}
		
		public Item(int pID, char pName,float pPrice ) {
			id = pID;
			name = pName;
			price = pPrice;
		}
		
		//method
		//variable in method --> biến cục bộ (chỉ dùng trong method)
		
		//itX.toString --> this = itX
		//itY.toString --> this = itY
		//this đại diện cho biến hiện tại thuộc datta type đang gọi
		
		@Override
		public String toString() {
			return this.id + "," + this.name + "," + this.price ;
		}
	
}
