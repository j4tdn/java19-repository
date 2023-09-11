package bean;

import java.math.BigDecimal;

public class Item {

	private Integer id;
	private String name;
	private BigDecimal salesPrice;
	private Integer storeId;

	public Item(Integer id) {
		this.id = id;
	}

	public Item(Integer id, String name, BigDecimal salesPrice, Integer storeId) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storeId = storeId;
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

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(this instanceof Item)) {
			return false;
		}
		
		// 2 đối tượng item sẽ equals với nhau nếu chung item id
		Item that = (Item)o;
		return getId().equals(that.getId());
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", storeId=" + storeId + "]";
	}
}