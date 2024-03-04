package dto;

import java.time.LocalDateTime;

public class ItemDto {

	public static final String PROP_ID = "itId";
	public static final String PROP_NAME = "itName";
	public static final String PROP_COLOR = "itColor";
	public static final String PROP_MATERIAL = "itMaterial";
	public static final String PROP_IMAGE01 = "itIm1";
	public static final String PROP_IMAGE02 = "itIm2";
	public static final String PROP_LAST_UPDATE_AT = "itLUA";
	public static final String PROP_ITEMGROUP_ID = "itIgId";
	public static final String PROP_PROVIDER_ID = "itgP";
	public static final String PROP_ITEMGROUP_NAME = "itgName";

	private Integer id;

	private String name;

	private String color;

	private String meterial;

	private String image1;

	private String image2;

	private LocalDateTime lastUpdatedAt;

	private Integer itemGroup;

	private Integer providerId;

	private String itemGroupName;

	public ItemDto(Integer id, String name, String color, String meterial, String image1, String image2,
			LocalDateTime lastUpdatedAt, Integer itemGroup, Integer providerId, String itemGroupName) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.meterial = meterial;
		this.image1 = image1;
		this.image2 = image2;
		this.lastUpdatedAt = lastUpdatedAt;
		this.itemGroup = itemGroup;
		this.providerId = providerId;
		this.itemGroupName = itemGroupName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMeterial() {
		return meterial;
	}

	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public LocalDateTime getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public Integer getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(Integer itemGroup) {
		this.itemGroup = itemGroup;
	}

	public Integer getProviderId() {
		return providerId;
	}

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}

	public String getItemGroupName() {
		return itemGroupName;
	}

	public void setItemGroupName(String itemGroupName) {
		this.itemGroupName = itemGroupName;
	}

	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", color=" + color + ", meterial=" + meterial + ", image1="
				+ image1 + ", image2=" + image2 + ", lastUpdatedAt=" + lastUpdatedAt + ", itemGroup=" + itemGroup
				+ ", providerId=" + providerId + ", itemGroupName=" + itemGroupName + "]";
	}

}
