package saleofgoods;

public class SaleUtils {

	private SaleUtils() {

	}

	public static double prepareTheBill(Customer c1, Book[] books) {
		double price = 0;
		for (Book book : books) {
			if (book instanceof TextBook) {
				TextBook t1 = (TextBook) book;
				if (!t1.isNew()) {
					price += t1.getPrice() * 0.7;
				} else {
					price += t1.getPrice();
				}
			}
			if (book instanceof ReferenceBook) {
				ReferenceBook t1 = (ReferenceBook) book;
				price = t1.getPrice() * (1 + t1.getTax());
			}
		}
		return price;
	}
}
