package persistence.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "MATERIAL")
	private String material;
	
	@Column(name = "BUY_PRICE")
	private BigDecimal buyPrice;
	
	@Column(name = "COLOR")
	private String color;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID")
	private ItemGroup group;
	
	@OneToMany(mappedBy = "item")
	private List<ItemDetail> details = new ArrayList<>();
	
	public List<ItemDetail> getDetails() {
		return details;
	}

	public void setDetails(List<ItemDetail> details) {
		this.details = details;
	}

	/**
	 * Empty constructor
	 */
	public Item() {
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public ItemGroup getGroup() {
		return group;
	}

	public void setGroup(ItemGroup group) {
		this.group = group;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Item)) {
			return false;
		}
		
		Item that = (Item)o;
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", material=" + material + ", buyPrice=" + buyPrice + ", color="
				+ color + "]";
	}
}
