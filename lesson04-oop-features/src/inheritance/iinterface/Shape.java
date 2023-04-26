package inheritance.iinterface;

public interface Shape {
	// có thể thêm thuộc tính vào interface
	// yêu cầu:
	
	//biến trong interface ngầm định hiểu là final
	//--> không thể cập nhật giá trị
	
	//vì sao final 
	//--> 
	//interface it khi chua bien
	
	//abstract method
	// ngam dinh la 'public abstract'
   void paint();
   
   void calArea();
   
   //default, static, private
   
   default void clear() {
	   System.out.println("shape --> clear all");
    }
   }

