package bean;

public class Word {
	private String word;
	private String mean;
	private String type;
	private String description;

	public Word(String word, String mean, String type, String description) {
		this.word = word;
		this.mean = mean;
		this.type = type;
		this.description = description;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", mean=" + mean + ", type=" + type + ", description=" + description + "]";
	}

	
}
