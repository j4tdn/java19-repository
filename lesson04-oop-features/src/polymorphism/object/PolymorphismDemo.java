package polymorphism.object;

public class PolymorphismDemo {
	public static void main(String[] args) {
		//lop con ke thua tu lop cha
		//lop con khong bat buoc phai override cac phuong thuc tu lop cha
		
		//shape     : paint, calArea
		//rectangle : paint, calArea, setBackgroud(-)
		//Square    : paint, calArea
		
		//class c = new class()
		//bien c --> luc compile
		//bien c --> luc runtime la kdl class
		
		Shape shape = new Shape();
		shape.paint();
		shape.calArea();
		
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calArea();
		rectangle.setBackGround();
		
		Square square = new Square();
		square.paint();
		square.calArea();
		
		// -------Da hinh trong doi tuong ------//
		//la 1 doi tuong luc la the hien nay, luc the hien khac
		//la 1 bien kdl doi tuong luc runtime co the la the hien kdl cua chinh no
		//hoac laf the hien cua kdl lop con
		
		System.out.println("\n==================\n");
		
		//1 2 1 2
		Shape s1 = new Rectangle();
		s1.paint();       // -->
		s1.calArea();	  // -->
		
		Shape s2 = new Square();
		s2.paint();
		s2.calArea();
		
		//s1 --> rectangle
		//s2 --> square
		//s1 --> 4 canh bang nhau --> square --> s1.calArel() --> s1 goi
		//ham tinh dien tich cua hv, minh k muon tao du lieu moi
		
		System.out.println("\n==============\n");
		
		s1 = s2; // s1 --> square
		s1.calArea();
		//--> de dang ep kieu qua ve giua cac KDL cha con
		//--> khong the ep kieu qua ve neu k dung da hinh trong doi tuong
		Rectangle r99 = new Rectangle();
		Square s99 = new Square();
		//r99 = s99;
				
		
		
		//ca nhan --> tre so sinh,hoc sinh, sinh vien, nhan vien
		//Person p = new Student()
		//Person p2 = new Employee();
		
		//vi sao phai ap dung da hinh trong doi tuong, lay cha new con
		//ma khong phai new chinh no
		
		//1. De dang ep kieu qua ve giua cac KDL cha con (compile tat ca deu la kieu cha)
		//2. Tham so KDL cha co the nhan gia tri cua KDL con khi truyen tham so qua ham
		//3. Tao ra mot mang co KDL cha va cac phan tu trong mang co the la KDL cha, con
		
		Shape[] shapes = {shape, rectangle, square, s1, s2};
		System.out.println("length --> " + shapes.length);
		
		//Square[] squares = {square, rectangle};
		
		//THUCHANH --> ko bat buoc phai ke thua, da hinh trong doi tuong
		//KHI NAO
		//du lieu, chuc nang chung cua cac KDL --> thua ke cha, con(s)
		//cha, con
	}
}
