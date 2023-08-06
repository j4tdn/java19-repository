package bean;

import java.math.BigDecimal;

public class Item {
	private Integer id;
	private String name;
	private BigDecimal salesPrice;
	private Integer getStoreID;

	public Item(Integer id, String name, BigDecimal salesPrice, Integer getStoreID) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.getStoreID = getStoreID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Integer getGetStoreID() {
		return getStoreID;
	}

	public void setGetStoreID(Integer getStoreID) {
		this.getStoreID = getStoreID;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(this instanceof Item)) {
			return false;
		}
		Item that = (Item)obj;
		return that.getId().equals(this.getId());
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", getStoreID=" + getStoreID + "]";
	}

}
