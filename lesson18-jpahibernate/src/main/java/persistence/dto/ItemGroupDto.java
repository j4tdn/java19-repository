package persistence.dto;

import java.util.Objects;

import persistence.entities.ItemGroup;


public class ItemGroupDto {
	public static String PROP_IG_ID = "igID";
	public static String PROP_IG_NAME = "igName";
	public static String PROP_TOTAL_OF_ITEMS = "totalOfItems";
	public static String PROP_IG_ITEMS = "items";
	

	private Integer igID;
	private String igName;
	private Long totalOfItems;
	private String items;
	
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
		return items;
	}

	public void setItem(String item) {
		this.items = item;
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
		return getIgID() == that.getID();
	}
	@Override
	public int hashCode() {
		return Objects.hash(getIgID());
		
	
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igID=" + igID + ", igName=" + igName + ", totalOfItems=" + totalOfItems + ", item=" + items
				+ "]";
	}
	
	
}
