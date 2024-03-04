package persistence.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ItemDto {
	public static String PROP_ID = "id";
	public static String PROP_NAME = "name";
	public static String PROP_LOCAL_DATE = "createdAt";
	
	private Integer id;
	private String name;
	private LocalDateTime createdAt;
	
	public ItemDto() {
		
	}
	
	public ItemDto(Integer id, String name, LocalDateTime lDateTime) {
		super();
		this.id = id;
		this.name = name;
		this.createdAt = lDateTime;
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



	public LocalDateTime getlDateTime() {
		return createdAt;
	}



	public void setlDateTime(LocalDateTime lDateTime) {
		this.createdAt = lDateTime;
	}



	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", lDateTime=" + createdAt.toLocalTime().toString() + "]";
	}
	
	
}
