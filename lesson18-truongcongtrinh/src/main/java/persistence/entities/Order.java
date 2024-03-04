package persistence.entities;

import java.time.LocalDateTime;
import java.util.Objects;

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

	@Column(name = "TOTAL_FEE")
	private Double total_fee;

	@Column(name = "DELIVERY_DATE")
	private String delivery_date;
	
	@Column(name = "DELIVERY_FEE")
	private Double delivery_fee;
	
	@Column(name = "CREATED_AT")
	private LocalDateTime created_at;

	public Order() {}

	public Order(Integer id, String delivery_address, Double total_fee, String delivery_date, Double delivery_fee,
			LocalDateTime created_at) {
		this.id = id;
		this.delivery_address = delivery_address;
		this.total_fee = total_fee;
		this.delivery_date = delivery_date;
		this.delivery_fee = delivery_fee;
		this.created_at = created_at;
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

	public Double getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(Double total_fee) {
		this.total_fee = total_fee;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
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

	@Override
	public int hashCode() {
		return Objects.hash(created_at, delivery_address, delivery_date, delivery_fee, id, total_fee);
	}
	
	

	@Override
	public String toString() {
		return "Order [id=" + id + ", delivery_address=" + delivery_address + ", total_fee=" + total_fee
				+ ", delivery_date=" + delivery_date + ", delivery_fee=" + delivery_fee + ", created_at=" + created_at
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(created_at, other.created_at) && Objects.equals(delivery_address, other.delivery_address)
				&& Objects.equals(delivery_date, other.delivery_date)
				&& Objects.equals(delivery_fee, other.delivery_fee) && Objects.equals(id, other.id)
				&& Objects.equals(total_fee, other.total_fee);
	}
}
