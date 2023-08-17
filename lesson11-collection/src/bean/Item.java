package bean;

import java.math.BigDecimal;

public class Item {
	private Integer id;
	private String name;
	private BigDecimal salePrice;
	private Integer storeId;

	public Item(Integer id) {
		this.id = id;
	}

	public Item(Integer id, String name, BigDecimal salePrice, Integer storeId) {

		this.id = id;
		this.name = name;
		this.salePrice = salePrice;
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

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
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
		Item that = (Item) o;
		return getId().equals(that.getId());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salePrice=" + salePrice + ", storeId=" + storeId + "]";
	}

	
}
