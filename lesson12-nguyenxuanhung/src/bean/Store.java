package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Store {
	private Integer storeId;
	private Integer referenceStoreId;
	private Integer stockPreviousDay;
	private BigDecimal expectedSales;
	private Boolean isSelected;
	
	public Store() {
	}

	public Store(Integer storeId, Integer referenceStoreId, Integer stockPreviousDay, BigDecimal expectedSales,
			Boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
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

	public Integer getStockPreviousDay() {
		return stockPreviousDay;
	}

	public void setStockPreviousDay(Integer stockPreviousDay) {
		this.stockPreviousDay = stockPreviousDay;
	}

	public BigDecimal getExpectedSales() {
		return expectedSales;
	}

	public void setExpectedSales(BigDecimal expectedSales) {
		this.expectedSales = expectedSales;
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
	public int hashCode() {
		return Objects.hash(expectedSales, isSelected, referenceStoreId, stockPreviousDay, storeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		return Objects.equals(expectedSales, other.expectedSales) && Objects.equals(isSelected, other.isSelected)
				&& Objects.equals(referenceStoreId, other.referenceStoreId)
				&& Objects.equals(stockPreviousDay, other.stockPreviousDay) && Objects.equals(storeId, other.storeId);
	}
	
	
}
