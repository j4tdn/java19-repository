package persistence.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "DELIVERY_ADDRESS")
	private String delivery_address;
	
	@Column(name = "DELIVERY_FEE")
	private Double delivery_fee;
	
	@Column(name = "CREATED_AT")
	private LocalDateTime created_at;
	
	

	public Order() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public Double getDelivery_fee() {
		return delivery_fee;
	}

	public void setDelivery_fee(Double delivery_fee) {
		this.delivery_fee = delivery_fee;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	
	
}
