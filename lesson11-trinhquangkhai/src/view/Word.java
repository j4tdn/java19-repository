package view;

public class Word {
private String meaning;
private String wordType;
private String note;

public Word() {
}

public Word(String meaning, String wordType, String note) {
	super();
	this.meaning = meaning;
	this.wordType = wordType;
	this.note = note;
}

public String getMeaning() {
	return meaning;
}

public void setMeaning(String meaning) {
	this.meaning = meaning;
}

public String getWordType() {
	return wordType;
}

public void setWordType(String wordType) {
	this.wordType = wordType;
}

public String getNote() {
	return note;
}

public void setNote(String note) {
	this.note = note;
}

@Override
public String toString() {
	return "Word [meaning=" + meaning + ", wordType=" + wordType + ", note=" + note + "]";
}


}
