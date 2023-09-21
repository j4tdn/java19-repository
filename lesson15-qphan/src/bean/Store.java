package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Store {

	private Item item;
	private Integer storeId;
	private String storeDesc;
	private BigDecimal storePotential;

	public Store() {
	}

	public Store(Item item, Integer storeId, String storeDesc, BigDecimal storePotential) {
		this.item = item;
		this.storeId = storeId;
		this.storeDesc = storeDesc;
		this.storePotential = storePotential;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreDesc() {
		return storeDesc;
	}

	public void setStoreDesc(String storeDesc) {
		this.storeDesc = storeDesc;
	}

	public BigDecimal getStorePotential() {
		return storePotential;
	}

	public void setStorePotential(BigDecimal storePotential) {
		this.storePotential = storePotential;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Store)) {
			return false;
		}

		Store that = (Store) o;

		return getStoreId().equals(that.getStoreId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getStoreId());
	}

	@Override
	public String toString() {
		return "Store [itemId = " + item.getItemId() + ", storeId=" + storeId + ", storeDesc=" + storeDesc
				+ ", storePotential=" + storePotential + "]";
	}

}
