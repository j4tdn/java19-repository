package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Store implements Comparable<Store>{
	private Long storeId;
	private Long referenceStoreId;
	private BigDecimal stockPreviousDay;
	private BigDecimal expectedSales;
	private boolean isSelected;

	public Store() {
	}

	public Store(Long storeId, Long referenceStoreId, BigDecimal stockPreviousDay, BigDecimal expectedSales,
			boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Long getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(Long referenceStoreId) {
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
		this.expectedSales = expectedSales;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	@Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Store)) {
            return false;
        }

        final Store that = (Store) o;

        return getStoreId().equals(that.getStoreId());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getStoreId());
    }
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", referenceStoreId=" + referenceStoreId + ", stockPreviousDay="
				+ stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected + "]";
	}

	@Override
	public int compareTo(Store o) {
		return getStoreId().compareTo(o.getStoreId());
	}

}
