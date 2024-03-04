package dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ItemDetailDto {
	
	public static final String PROP_IT_ID = "itId";
	public static final String PROP_IT_NAME = "itName";
	public static final String PROP_DATE = "odDate";
	
	private Integer itId;
	private String itName;
	private String odDate;
	
	public ItemDetailDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemDetailDto(Integer itId, String itName, String odDate) {
		super();
		this.itId = itId;
		this.itName = itName;
		this.odDate = odDate;
	}

	public Integer getItId() {
		return itId;
	}

	public void setItId(Integer itId) {
		this.itId = itId;
	}

	public String getItName() {
		return itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public String getOdDate() {
		return odDate;
	}

	public void setOdDate(String odDate) {
		this.odDate = odDate;
	}

	@Override
	public String toString() {
		return "ItemDetailDto [itId=" + itId + ", itName=" + itName + ", odDate=" + odDate + "]";
	}
	
	
	
	
}
