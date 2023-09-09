package common;

import java.math.BigDecimal;

public class Item {
	Integer id;
	String name;
	BigDecimal salePrice;
	
	public Item() {
		
	}
	public Item(Integer id, String name, BigDecimal salePrice) {
		this.id = id;
		this.name = name;
		this.salePrice = salePrice;
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
	public BigDecimal getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salePrice=" + salePrice + "]";
	}
}
