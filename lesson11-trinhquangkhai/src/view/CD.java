package view;

public class CD {
private int code;
private String CD_type;
private String singer;
private int number_song;
private double price;

public CD() {
}

public CD(int code, String cD_type, String singer, int number_song, double price) {
	super();
	this.code = code;
	CD_type = cD_type;
	this.singer = singer;
	this.number_song = number_song;
	this.price = price;
}

public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

public String getCD_type() {
	return CD_type;
}

public void setCD_type(String cD_type) {
	CD_type = cD_type;
}

public String getSinger() {
	return singer;
}

public void setSinger(String singer) {
	this.singer = singer;
}

public int getNumber_song() {
	return number_song;
}

public void setNumber_song(int number_song) {
	this.number_song = number_song;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "CD [code=" + code + ", CD_type=" + CD_type + ", singer=" + singer + ", number_song=" + number_song
			+ ", price=" + price + "]";
}

}