package store;

public class Store {
    private Integer storeId;
    private Integer referenceStoreId;
    private Float stockPreviousDay;
    private Float expectedSales;
    private Boolean isSelected;

    public Store(Integer storeId, Integer referenceStoreId, Float stockPreviousDay, Float expectedSales, Boolean isSelected) {
        this.storeId = storeId;
        this.referenceStoreId = referenceStoreId;
        this.stockPreviousDay = stockPreviousDay;
        this.expectedSales = expectedSales;
        this.isSelected = isSelected;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public Integer getReferenceStoreId() {
        return referenceStoreId;
    }

    public Float getStockPreviousDay() {
        return stockPreviousDay;
    }

    public Float getExpectedSales() {
        return expectedSales;
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public void setReferenceStoreId(Integer referenceStoreId) {
        this.referenceStoreId = referenceStoreId;
    }

    public void setStockPreviousDay(Float stockPreviousDay) {
        this.stockPreviousDay = stockPreviousDay;
    }

    public void setExpectedSales(Float expectedSales) {
        this.expectedSales = expectedSales;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId +
                ", referenceStoreId=" + referenceStoreId +
                ", stockPreviousDay=" + stockPreviousDay +
                ", expectedSales=" + expectedSales +
                ", isSelected=" + isSelected +
                '}';
    }
}