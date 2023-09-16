package streamadv.bean;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Store {
	private Integer storeId;
	private Integer referenceStoreId;
	private BigDecimal stockPreviousDay;
	private BigDecimal expectedSales;
	private Boolean isSelected;
//	private Integer allocationAmount;
//	private BigDecimal allocationKey;

	public Store(Integer storeId, Integer referenceStoreId, BigDecimal stockPreviousDay, BigDecimal expectedSales,
			Boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
//		this.allocationAmount = allocationAmount;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(Integer referenceStoreId) {
		this.referenceStoreId = referenceStoreId;
	}

	public BigDecimal getStockPreviousDay() {
		return stockPreviousDay;
	}

	public void setStockPreviousDay(BigDecimal stockPreviousDay) {
		this.stockPreviousDay = stockPreviousDay;
	}

	public BigDecimal getExpectedSales() {
		return expectedSales;
	}

	public void setExpectedSales(BigDecimal expectedSales) {
		this.expectedSales = expectedSales.setScale(1, RoundingMode.HALF_EVEN);
	}

	public Boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}


	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", referenceStoreId=" + referenceStoreId + ", stockPreviousDay="
				+ stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(this instanceof Store)) {
			return false;
		}

		Store that = (Store) o;
		return getStoreId().equals(that.getStoreId());
	}

	
	
	
	
}
