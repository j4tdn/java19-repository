package inheritance.basic;

import java.lang.reflect.Array;
import java.util.Arrays;

import polymorphism.object.Rectangle;

public class InheritanceBasicDemo {
	public static void main(String[] args) {
		// sách giáo khoa : id, name, publisher, isnew
		// sách tham khảo : id, name, published, tax
		
//		ClassicalBook cb = new ClassicalBook(1, "B1", "ND",false);
//		System.out.println(cb);
		
		//Tạo ra 1 danh sách các cuốn sách (giáo khoa, tham khảo)
		
		ClassicalBook cb1 = new ClassicalBook(1, "Toán", "Nhi Đồng",true);
		ClassicalBook cb2 = new ClassicalBook(2, "Lý", "Nhi Đồng",false);
		ClassicalBook cb3 = new ClassicalBook(3, "Hóa", "Kim Đồng",true);
		ClassicalBook cb4 = new ClassicalBook(4, "Lịch Sử", "Kim Đồng",true);
		
		ReferenceBook rb1  = new ReferenceBook(5, "STK Toán 1", "Nhi Đồng",12d);
		ReferenceBook rb2  = new ReferenceBook(6, "STK Lý 2", "Nhi Đồng",8d);
		ReferenceBook rb3  = new ReferenceBook(7, "STK Văn", "Nhi Đồng",22d);
		ReferenceBook rb4 = new ReferenceBook(8, "STK Công nghệ", "Nhi Đồng",2d);
		
		Book[] books = {cb1, cb2, cb3, cb4, rb1, rb2, rb3, rb4};
		
		//Viết hàm tìm những cuốn sách có id < 6
		//Viết hàm tìm những cuốn sách có thuế > 10%
		
		Book[] resultBooksById = findBooksByIds(books);
		System.out.println("Fine By Id --> " + Arrays.toString(resultBooksById));
		
		System.out.println("============================================");
		
		Book[] resultBooksByTax = findBooksByTaxs(books);
		System.out.println("Find By Id --> " + Arrays.toString(resultBooksByTax));
	}
	
	private static Book[] findBooksByIds(Book[] books) {
		Book[] books2 = new Book[books.length];
		int i=0;
		for(Book book : books) {
			if(book.getId() < 6) {
				books2[i++] = book;
			}
		}
		Book[] finalResult = Arrays.copyOfRange(books2, 0, i);
		
		return finalResult;
	}
	
	private static Book[] findBooksByTaxs(Book[] books) {
		Book[] result = new Book[books.length];
		int i=0;
		for(Book book : books) {
//			book.getClass() == ReferenceBook.class && book!= null
			if(book instanceof ReferenceBook) {
				if(((ReferenceBook) book).getTax() > 10) {
					result[i++] = book;
				}
			}
		}
		Book[] finalResult = Arrays.copyOfRange(result, 0, i);
		
		return finalResult;
	}
	
}
