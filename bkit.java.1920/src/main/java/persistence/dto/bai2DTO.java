package persistence.dto;

import java.time.LocalTime;

public class bai2DTO {
	public static String PROP_IG_ID = "id";
	public static String PROP_IG_NAME = "name";
	public static String PROP_AMOUNT_OF_ITEMS = "amount_of_items";
	
	private Integer id;
	private String name;
	private Integer amount_of_items;
	public bai2DTO(Integer id, String name, Integer amount_of_items) {
		super();
		this.id = id;
		this.name = name;
		this.amount_of_items = amount_of_items;
	}
	public bai2DTO() {
		super();
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
	public Integer getAmount_of_items() {
		return amount_of_items;
	}
	public void setAmount_of_items(Integer amount_of_items) {
		this.amount_of_items = amount_of_items;
	}
	@Override
	public String toString() {
		return "bai2DTO [id=" + id + ", name=" + name + ", amount_of_items=" + amount_of_items + "]";
	}
	
	
}
