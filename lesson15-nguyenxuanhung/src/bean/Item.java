package bean;

import java.util.Objects;

public class Item {
	
	private Integer itemId;
	private String itemName;
	
	public Item() {
	}

	public Item(Integer itemId, String itenName) {
		this.itemId = itemId;
		this.itemName = itenName;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItenName() {
		return itemName;
	}

	public void setItenName(String itenName) {
		this.itemName = itenName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Item)) {
			return false;
		}

		Item that = (Item) o;

		return getItemId().equals(that.getItemId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getItemId());
	}
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + "]";
	}
}
