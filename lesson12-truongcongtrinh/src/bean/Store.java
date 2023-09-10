package bean;

import java.math.BigDecimal;

public class Store {
	private String storeId;
	private String referenceStoreId;
	private Integer stockPreviousDay;
	private BigDecimal expectedSales;
	private boolean isSelected;

	public Store() {
	}

	public Store(String storeId, String referenceStoreId, Integer stockPreviousDay, BigDecimal expectedSales,
			boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(String referenceStoreId) {
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

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", referenceStoreId=" + referenceStoreId + ", stockPreviousDay="
				+ stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected + "]";
	}

}
