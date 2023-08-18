package bean;

import java.util.Objects;

public class Word {
	private String word;
	private String meaningOfWord;
	private String kindOfWord;
	private String note;
	
	public Word() {
	}

	public Word(String word, String meaningOfWord, String kindOfWord, String note) {
		super();
		this.word = word;
		this.meaningOfWord = meaningOfWord;
		this.kindOfWord = kindOfWord;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaningOfWord() {
		return meaningOfWord;
	}

	public void setMeaningOfWord(String meaningOfWord) {
		this.meaningOfWord = meaningOfWord;
	}

	public String getKindOfWord() {
		return kindOfWord;
	}

	public void setKindOfWord(String kindOfWord) {
		this.kindOfWord = kindOfWord;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", meaningOfWord=" + meaningOfWord + ", kindOfWord=" + kindOfWord + ", note="
				+ note + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(kindOfWord, meaningOfWord, note, word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(kindOfWord, other.kindOfWord) && Objects.equals(meaningOfWord, other.meaningOfWord)
				&& Objects.equals(note, other.note) && Objects.equals(word, other.word);
	}
	
}
