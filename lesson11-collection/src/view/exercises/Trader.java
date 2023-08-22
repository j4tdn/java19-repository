package view.exercises;

public class Trader {
private String fullname;
private String livingCity;

public Trader() {
}

public Trader(String fullname, String livingCity) {
	super();
	this.fullname = fullname;
	this.livingCity = livingCity;
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getLivingCity() {
	return livingCity;
}

public void setLivingCity(String livingCity) {
	this.livingCity = livingCity;
}

@Override
public String toString() {
	return "Trader [fullname=" + fullname + ", livingCity=" + livingCity + "]";
}


}
