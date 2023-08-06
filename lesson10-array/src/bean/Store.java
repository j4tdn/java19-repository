package bean;

public class Store implements Comparable<Store> {
	private Integer id;
	private String name;
	private Long amountOfItem;
	private Integer countryId;

	public Store() {
	}

	public Store(Integer id, String name, Long amountOfItem, Integer countryId) {
		this.id = id;
		this.name = name;
		this.amountOfItem = amountOfItem;
		this.countryId = countryId;
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

	public Long getAmountOfItem() {
		return amountOfItem;
	}

	public void setAmountOfItem(Long amountOfItem) {
		this.amountOfItem = amountOfItem;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	@Override
	public int compareTo(Store o) {
		// sorting countryID desc, storeId asc 
		
		if(this.getCountryId().equals(o.getCountryId())) {
			return this.getId().compareTo(o.getId());
		}
		return o.getCountryId().compareTo(this.getCountryId());
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", amountOfItem=" + amountOfItem + ", countryId=" + countryId
				+ "]\n";
	}
}
