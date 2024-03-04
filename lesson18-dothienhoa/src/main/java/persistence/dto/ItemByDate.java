package persistence.dto;

public class ItemByDate {
	
	public static String PROP_IG_ID = "igId";
	public static String PROP_IG_NAME = "igName";
	public static String PROP_CREATE_DATE = "createTime";

	private Integer igId;
	private String igName;
	private String createTime;

	public ItemByDate() {

	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "ItemByDate [igId=" + igId + ", igName=" + igName + ", createTime=" + createTime + "]";
	}

}
