package bean;

public class ItemDetail {
	private int itemId;
    private String name;
    private int salesPrice;
    private int storeId;

    public ItemDetail() {
		// TODO Auto-generated constructor stub
	}
    
    public ItemDetail(int itemId, String name, int salesPrice, int storeId) {
        this.itemId = itemId;
        this.name = name;
        this.salesPrice = salesPrice;
        this.storeId = storeId;
    }

    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public int getStoreId() {
        return storeId;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", salesPrice=" + salesPrice +
                ", storeId=" + storeId +
                '}';
    }
}