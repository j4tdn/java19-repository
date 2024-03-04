package persistence.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/*
 * Sử dụng ORM framwork để mapping class trong java với database
 * 
 * Tên class bất kì
 * tên table bất kì
 * 
 * Mapping class với table name
 * mapping attributes với table columns
 * Mapping constraints
 * 
 * Không phải mapping 1/all classes với tables
 * khi nào cần truy vấn trả vè dạng entity thì mình mới mapping
 * để đỡ phải set tay column với entity
 * 
 * */

@Entity
@Table(name = "item_group")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@NamedQueries(
//		@NamedQuery(
//				name = ItemGroup.Q_GET_ALL,
//				query = "From ItemGroup"  (JPQL)
//		)
//)

@NamedNativeQueries(@NamedNativeQuery(name = ItemGroup.Q_GET_ALL, query = "Select * from item_group" // (Native query)
))
public class ItemGroup {

	public static final String Q_GET_ALL = "Q_GET_ALL";

	@Id
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@OneToMany(mappedBy = "group")
	private List<Item> items;

	/*
	 * Hiberbate required emty constructor
	 * 
	 */
	public ItemGroup() {
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public ItemGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ItemGroup)) {
			return false;
		}

		ItemGroup that = (ItemGroup) o;
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return this.id + " " + this.name;
	}
}
