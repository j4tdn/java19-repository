package bean;

import java.math.BigDecimal;

public class CD {
	private Integer id;
	private String type;
	private String author;
	private Integer songs;
	private BigDecimal price;

	public CD() {
	}

	public CD(Integer id, String type, String author, Integer songs, BigDecimal price) {
		this.id = id;
		this.type = type;
		this.author = author;
		this.songs = songs;
		this.price = price;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getSongs() {
		return songs;
	}

	public void setSongs(Integer songs) {
		this.songs = songs;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", type=" + type + ", author=" + author + ", songs=" + songs + ", price=" + price + "]";
	}
}
