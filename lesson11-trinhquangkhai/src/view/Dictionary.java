package view;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
private Map<String, Word> dictionary;

public Dictionary() {
	dictionary = new HashMap<>();
}

public void addWord(String word, String meaning, String wordType, String note) {
	Word newWord = new Word(meaning, wordType, note);
	dictionary.put(note, newWord);
	System.out.println("add the word /" + word + "/ in dictionary");
}
public void lookUpWord(String word) {
	if(dictionary.containsKey(word)) {
		Word lookUpWord =  dictionary.get(word);
		System.out.println("The word: " + word);
		System.out.println("Kind of the word: " + lookUpWord.getWordType());
		System.out.println("Note: " + lookUpWord.getNote());
	}else {
		System.out.println("Couldn't find the word /" + word + "/ in dictionary" );
	}
}
}
