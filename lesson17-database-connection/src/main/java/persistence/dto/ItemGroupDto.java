package persistence.dto;

import java.util.Objects;

import persistence.ItemGroup;

public class ItemGroupDto {

	private Integer igID;
	private String igName;
	private Long totalOfItems;
	private String item;
	
	public ItemGroupDto() {
	}

	public Integer getIgID() {
		return igID;
	}

	public void setIgID(Integer igID) {
		this.igID = igID;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public Long getTotalOfItems() {
		return totalOfItems;
	}

	public void setTotalOfItems(Long totalOfItems) {
		this.totalOfItems = totalOfItems;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	@Override
	public boolean equals(Object o ) {
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof ItemGroup)) {
			return false;
		}
		
		ItemGroup that = (ItemGroup)o;
		return getIgID() == that.getId();
	}
	@Override
	public int hashCode() {
		return Objects.hash(getIgID());
		
	
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igID=" + igID + ", igName=" + igName + ", totalOfItems=" + totalOfItems + ", item=" + item
				+ "]";
	}
	
	
}
