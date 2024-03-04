package persistence.dto;

import java.time.LocalDateTime;

public class ItemGroupDto {
	public static String PROP_ID = "id";
	public static String PROP_NAME = "name";
	public static String PROP_AMOUNT_OF_ITEM = "amountOfItem";
	
	private Integer id;
	private String name;
	private Integer amountOfItem;
	
	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemGroupDto(Integer id, String name, Integer amountOfItem) {
		super();
		this.id = id;
		this.name = name;
		this.amountOfItem = amountOfItem;
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
	public Integer getAmountOfItem() {
		return amountOfItem;
	}
	public void setAmountOfItem(Integer amountOfItem) {
		this.amountOfItem = amountOfItem;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", amountOfItem=" + amountOfItem + "]";
	}
	
}
