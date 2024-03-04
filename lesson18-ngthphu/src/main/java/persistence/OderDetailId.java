package persistence;

import java.io.Serializable;

public class OderDetailId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer orderId;
	private Integer itemId;

	public OderDetailId(Integer orderId, Integer itemId) {
		super();
		this.orderId = orderId;
		this.itemId = itemId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

}
