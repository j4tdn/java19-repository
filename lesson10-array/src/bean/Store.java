package bean;

public class Store{
	private Integer storeId;
	private String name;
	private Long amountOfItems;
	private Integer countryId;
	public Store() {
		// TODO Auto-generated constructor stub
	}
	public Store(Integer storeId, String name, Long amountOfItems, Integer countryId) {
		super();
		this.storeId = storeId;
		this.name = name;
		this.amountOfItems = amountOfItems;
		this.countryId = countryId;
	}
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAmountOfItems() {
		return amountOfItems;
	}
	public void setAmountOfItems(Long amountOfItems) {
		this.amountOfItems = amountOfItems;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", name=" + name + ", amountOfItems=" + amountOfItems + ", countryId="
				+ countryId + "]\n";
	}
	
}
