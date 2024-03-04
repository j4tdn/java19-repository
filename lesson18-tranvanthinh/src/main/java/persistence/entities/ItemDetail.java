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
import javax.persistence.Table;

@Entity
@Table(name = "item_detail")
public class ItemDetail {
	@Id
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "AMOUNT")
	private Integer amount;

	@Column(name = "SALES_PRICE")
	private BigDecimal salesPrice;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_ID", referencedColumnName = "ID")
	private Item item;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIZE_ID", referencedColumnName = "ID")
	private Size size;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "itemDetail")
	private List<OrderDetail> orderDetail = new ArrayList<>();  
	

	public ItemDetail() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}



	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", amount=" + amount + ", salesPrice=" + salesPrice + ", item=" + item + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof ItemDetail)) {
			return false;
		}

		ItemDetail that = (ItemDetail) o;

		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

}
