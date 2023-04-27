package view;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK01", 150, "Nhi Đồng", true);
		TextBook tb2 = new TextBook("SGK02", 120, "Kim Đồng", false);
		TextBook tb3 = new TextBook("SGK03", 180, "Giao Duc", true);

		ReferBook rb1 = new ReferBook("STK01", 300, "Giao Duc", 10);
		ReferBook rb2 = new ReferBook("STK02", 250, "Nhi Đồng", 5);

		Book[] list = { tb1, tb2, tb3, rb1, rb2 };

		System.out.println("\nHiển thị thông tin các sách có trong cửa hàng:\n");
		for (Book books : list) {
			System.out.println(books);
		}
		
		System.out.println("\nTìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng:");

	    for (Book books : list) {
	        if (books.getPublisher().equals("Nhi Đồng")) {
	            System.out.println(books);
	        }
	    }
	    
	    System.out.println("\nTìm toàn bộ sách có đơn giá nhỏ hơn 50:");

	    for (Book books : list) {
	        if (books.getPrice() < 50f) {
	            System.out.println(books);
	        }
	    }
	    
	    System.out.println("\nTìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200:");

	    for (Book books : list) {
	    	if (books.getClass() == TextBook.class) {
				if (books.getPrice() >= 100f && books.getPrice() <= 200f) {
	            System.out.println(books);
				}
	    	}
	    }
	    
	    double totalCost = calculateTotalCost(tb1, rb1);
	    System.out.println("\nTổng tiền khách hàng phải thanh toán : " + totalCost);
	}

	public static double calculateTotalCost(TextBook tb, ReferBook rb) {
	    double totalCost = 0;

	    // Tính tiền sách giáo khoa
	    double tbCost = 0;
	    if (tb.isNew()) {
	        tbCost = tb.getPrice();
	    } else {
	        tbCost = tb.getPrice() * 0.7; // Giảm giá 30% cho sách cũ
	    }
	    totalCost += tbCost;

	    // Tính tiền sách tham khảo
	    double rbCost = rb.getPrice() * (1 + rb.getTaxPercentage()/100);
	    totalCost += rbCost;

	    return totalCost;
	}
}