package exercises;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		ArrayList<Merchandise> array = new ArrayList<>();
		array.add(new Merchandise(1, "A", 25, 101));
		array.add(new Merchandise(2, "B", 1, 102));
		array.add(new Merchandise(3, "C", 88, 102));
		array.add(new Merchandise(4, "D", 40, 101));
		array.add(new Merchandise(5, "E", 60, 102));
		array.add(new Merchandise(6, "F", 18, 101));

		array.sort(new Comparator<Merchandise>() {

			@Override
			public int compare(Merchandise o1, Merchandise o2) {
				// TODO Auto-generated method stub
				return (int) (o2.salesPrice - o1.salesPrice);
			}
		});
		System.out.println(array.get(0).toString());
	}

	static class Merchandise {
		private int itemID, storeID;
		private String name;
		private double salesPrice;

		public Merchandise() {
		}

		public Merchandise(int itemID, String name, double salesPrice, int storeID) {
			this.itemID = itemID;
			this.storeID = storeID;
			this.name = name;
			this.salesPrice = salesPrice;
		}

		@Override
		public String toString() {
			return "Merchandise [itemID=" + itemID + ", storeID=" + storeID + ", name=" + name + ", salesPrice="
					+ salesPrice + "]";
		}

		public int getItemID() {
			return itemID;
		}

		public void setItemID(int itemID) {
			this.itemID = itemID;
		}

		public int getStoreID() {
			return storeID;
		}

		public void setStoreID(int storeID) {
			this.storeID = storeID;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalesPrice() {
			return salesPrice;
		}

		public void setSalesPrice(double salesPrice) {
			this.salesPrice = salesPrice;
		}
	}
}
