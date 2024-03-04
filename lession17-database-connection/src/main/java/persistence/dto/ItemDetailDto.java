package persistence.dto;

import persistence.ItemGroup;

public class ItemDetailDto {
	private Integer itemId;
	private String name;
	private Integer size;
	private Integer amount;
	private ItemGroup group;
	
	public ItemDetailDto() {
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public ItemGroup getGroup() {
		return group;
	}

	public void setGroup(ItemGroup group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "ItemDetailDto [itemId=" + itemId + ", name=" + name + ", size=" + size + ", amount=" + amount
				+ ", group=" + group + "]";
	}
	
	
}
