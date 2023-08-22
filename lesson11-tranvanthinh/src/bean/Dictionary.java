package bean;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	private Map<String, Word> words;
	
	public Dictionary() {
		words = new HashMap<>();
	}

	public Map<String, Word> getWords() {
		return words; 
	}

	public void setWords(Map<String, Word> words) {
		this.words = words;
	}
	
	public void add(Word word) {
		words.put(word.getWord(), word);
	}
	
	public void search(String wordFind) {
		Word word = words.get(wordFind);
		if(word != null) {
			System.out.println(word);
		}
		else {
			System.out.println("Can't find");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
