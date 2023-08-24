package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class CD {
	private Integer id;
	private String type;
	private String singer;
	private Integer countOfSongs;
	private BigDecimal prices;

	public CD() {
	}

	public CD(Integer id, String type, String singer, Integer countOfSongs, BigDecimal prices) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.countOfSongs = countOfSongs;
		this.prices = prices;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Integer getCountOfSongs() {
		return countOfSongs;
	}

	public void setCountOfSongs(Integer countOfSongs) {
		this.countOfSongs = countOfSongs;
	}

	public BigDecimal getPrices() {
		return prices;
	}

	public void setPrices(BigDecimal prices) {
		this.prices = prices;
	}

	@Override
	public String toString() {
		return "Disc [id=" + id + ", type=" + type + ", singer=" + singer + ", countOfSongs=" + countOfSongs
				+ ", prices=" + prices + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(countOfSongs, id, prices, singer, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CD))
			return false;
		CD other = (CD) obj;
		return Objects.equals(id, other.id);
	}

}
