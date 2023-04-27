package ex05;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		ClassicalBook c1 = new ClassicalBook("SGK1", 40, "Kim Đồng", false);
		ClassicalBook c2 = new ClassicalBook("SGK2", 63, "Nhi Đồng", true);
		ClassicalBook c3 = new ClassicalBook("SGK3", 119, "Kim Đồng", true);

		ReferenceBook r1 = new ReferenceBook("STK1", 152, "Nhi Đồng", 10d);
		ReferenceBook r2 = new ReferenceBook("STK2", 42, "Kim Đồng", 20d);

		Book[] books = { c1, c2, c3, r1, r2 };
		// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
		Book[] bookByAuthor = findByAuthor(books);
		System.out.println("bookByAuthor --->" + Arrays.toString(bookByAuthor));
		System.out.println("=======(^-^)========\n");
		// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
		Book[] bookByPrice = findByPrice(books);
		System.out.println("bookByPrice --->" + Arrays.toString(bookByPrice));
		System.out.println("=======(^-^)========\n");

		//Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
		Book[] classicalBBPrice = findClassicalBookByPrice(books);
		System.out.println("classicalBookByPrice --->" + Arrays.toString(classicalBBPrice));
		
		//tính tổng tiền mà khách hàng phải thanh toán
		
	}
	private static Book[] sumOfMoney(Book[] books) {
		for (Book book: books) {
			if (book instanceof ClassicalBook) {
				ClassicalBook cs = (ClassicalBook)book;
				if (cs.isNew() == false) {
					book = cs.getPrice() * 0,3;
				}
			}
		}
	}
	
	
	private static Book[] findClassicalBookByPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			if(book instanceof ClassicalBook) {
				ClassicalBook cs = (ClassicalBook)book;
				if (cs.getPrice() > 100 && cs.getPrice() < 200) {
					result[running++] = cs;
				}
			}
			
		}
		return Arrays.copyOfRange(result, 0, running);

	}

	private static Book[] findByPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			if (book.getPrice() < 50) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);

	}

	private static Book[] findByAuthor(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			if (book.getAuthor() == "Nhi Đồng") {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
