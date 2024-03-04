package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "item_group")
@NamedQueries(@NamedQuery(name = ItemGroup.GET_ALL_ITEM_GROUPS, query = "FROM ItemGroup"))
public class ItemGroup {

	public static final String GET_ALL_ITEM_GROUPS = "GET_ALL_ITEM_GROUPS";

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "itemGroup")
	private List<Item> items;

	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name) {
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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
}