package persistence.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/*
 * Sử dụng ORM framework để mapping class trong java với table trong Database
 * + Tên class bất kỳ 
 * + Tên table bất kỳ 
 * + Mapping class với table name 
 * + Mapping attributes với table columns
 * + Mapping constraints
 * 
 * Không bắt buộc phải mapping 1 or all classes với tables
 * Khi nào cần truy vấn trả về dạng entities mình mới mapping 
 * để đỡ phải set tay với column với attribute
 */


@Entity
@Table(name = "item_group")
@NamedNativeQueries(
		@NamedNativeQuery (name = ItemGroup.Q_GET_ALL, 
		query = "SELECT * FROM item_group",
		resultClass = ItemGroup.class
		)
		)
public class ItemGroup {
	public static final String Q_GET_ALL = "Q_GET_ALL";
	
	@Id
	@Column(name = "ID", nullable = false)
	private Integer ID;
	
	@Column(name = "NAME", nullable = false)
	private String name; 
	
	@OneToMany(mappedBy = "group")
	private List<Item> items;
	
	public ItemGroup() {
	}

	public ItemGroup(Integer iD, String name) {
		ID = iD;
		this.name = name;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
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
		return getID() == that.getID();
	}
	@Override
	public int hashCode() {
		return Objects.hash(getID());
		
	
	}

	@Override
	public String toString() {
		return "ItemGroup [ID=" + ID + ", name=" + name + "]";
	}
	
	
	
	
}
