package inheritance.multiple;

public class Child extends Father {
	/*
	 Lưu ý: Class con thừa kê từ Class cha
	 + Không bắt buộc override method từ lớp cha
	 + Mặc định đã thừ kế và sử dụng các hàm bên class cha 
	 */
	
	void codingSkills() {
		System.out.println("backend + database");
	}
	
	/*
	 Muốn hỗ trợ đa thừa kế khi class con kế thừa phương thức xuất hiện ở nhiều class cha
	 --> phương thức đó cần bắt buộc override lại
	 */
}
