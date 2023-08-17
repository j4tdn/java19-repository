package bean;

public class Item {
	private int id;
	private String name;
	private double salesPrice;
	private int storeId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public Item() {
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", storeId=" + storeId + "]";
	}
	public Item(int id, String name, double salesPrice, int storeId) {
		super();
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storeId = storeId;
	}
}
