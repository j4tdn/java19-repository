package persistence.dto;

public class ItemCount {

	public static String PROP_IG_ID = "igId";
	public static String PROP_IG_NAME = "igName";
	public static String PROP_TOTAL_OF_ITEMS = "totalOfItems";

	private Integer igId;
	private String igName;
	private Long totalOfItems;

	public ItemCount() {

	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
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

	@Override
	public String toString() {
		return "ItemCount [igId=" + igId + ", igName=" + igName + ", totalOfItems=" + totalOfItems + "]";
	}

}
