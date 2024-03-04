package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")

public class OrderDetail implements Serializable {
	@Id
	@Column(name = "ORDER_ID")
	private Integer orderId;

	@Id
	@Column(name = "ITEM_ID")
	private Long itemId;

	@Column(name = "AMOUNT")
	private int amount;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORDER_ID")
	private Order order;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_ID")
	private Item item;
}
