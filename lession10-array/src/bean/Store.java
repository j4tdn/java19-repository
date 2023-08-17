package bean;

public class Store implements Comparable<Store>{
	private Integer id;
	private String name;
	private Long amountOfItems;
	private Integer countryId;
	
	public Store() {
		
	}

	public Store(Integer id, String name, Long amountOfItems, Integer countryId) {
		super();
		this.id = id;
		this.name = name;
		this.amountOfItems = amountOfItems;
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
		return "Store [id=" + id + ", name=" + name + ", amountOfItems=" + amountOfItems + ", countryId=" + countryId
				+ "]\n";
	}

	@Override
	public int compareTo(Store o) {
		Store s1 =this;
		Store s2 = o;
		// sorting name asc
		if(!s1.getCountryId().equals(s2.getCountryId())) {
			return s2.getCountryId().compareTo(s1.getCountryId());
		}
		
		return s1.getId().compareTo(s2.getId());
	}
	
	
}
