package saleofgoods;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK", 15000d, "Kim Đồng", true);
		TextBook tb2 = new TextBook("SGK", 170, "Nhi Đồng", false);
		TextBook tb3 = new TextBook("SGK", 150d, "Kim Đồng", true);

		ReferenceBook rb1 = new ReferenceBook("STK", 15d, "Kim Đồng", 20d);
		ReferenceBook rb2 = new ReferenceBook("STK", 15d, "Nhi Đồng", 20d);

		Book[] books = { tb1, tb2, tb3, rb1, rb2 };
		Utils.show("Sách thuộc nhà xuất bản Nhi Đồng");
		System.out.println(Arrays.toString(BookUtils.findBookNhiDong(books)));
		Utils.show("Sách có đơn giá nhỏ hơn 50");
		System.out.println(Arrays.toString(BookUtils.findBookPrice(books, 50d)));
		Utils.show("Sách có đơn giá từ 100 đến 200");
		System.out.println(Arrays.toString(BookUtils.findBookPriceToPrice(books, 100d, 200d)));
		Utils.show("Tổng tiền cần thanh toán");
		Customer c1 = new Customer("c1", "Do Thien Hoa", "0983801656", "Ho Dac Di");
		Book[] bookss = { tb1, rb1 };
		System.out.println(SaleUtils.prepareTheBill(c1, bookss));
	}

}
