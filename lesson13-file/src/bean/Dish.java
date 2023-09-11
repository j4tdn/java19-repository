package bean;

import java.io.Serializable;

import functional.FileLine;

public class Dish implements FileLine, Serializable{
	private static final long serialVersionUID = -5049550551542945079L;

	private String id;
	private String name;
	private Integer calories;
	private Category category;
	
	public Dish() {
	}

	public Dish(String id, String name, Integer calories, Category category) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	@Override
	public String toLine() {
		return getId() + ", " + getName() + ", " + getCalories() + ", " + getCategory();
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + ", category=" + category + "]";
	}
	
}
