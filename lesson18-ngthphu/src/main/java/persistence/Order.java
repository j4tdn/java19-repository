package persistence;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {
	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "DELIVERY_ADDRESS")
	private String deliveryAddress;

	@Column(name = "TOTAL_FEE")
	private double totalFee;

	@Column(name = "DELIVERY_DATE")
	private LocalDateTime deliveryDate;

	@Column(name = "DELIVERY_FEE")
	private double deliveryFee;

	@Column(name = "CREATED_AT")
	private LocalDateTime createdAd;

	@OneToMany(mappedBy = "order")
	private List<OrderDetail> orderDetails;
}
