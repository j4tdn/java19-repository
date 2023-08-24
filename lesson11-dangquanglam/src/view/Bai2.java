package view;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.CD;
import bean.Word;

public class Bai2 {
	public static void main(String[] args) {
		List<Word> words = mockData();

		boolean isSuccess = addNewWord(new Word("That", "Kia", "Tinh tu", "Note 4"), words);
		if (isSuccess) {
			System.out.println("Add new Word successful");
		} else {
			System.out.println("Word id is duplicated");
		}

		words.forEach(System.out::println);
		
		System.out.println("===================================================");
		
		Map<String, Word> wordsMap = createWordMap(words);
		System.out.println("Tra từ điển: " + searchWord("Table", wordsMap));
	}

	private static List<Word> mockData() {
		List<Word> word = new ArrayList<>();
		
		word.add(new Word("People", "Nguoi", "Danh tu", "Note 1")); 
		word.add(new Word("Table", "Ban", "Danh tu", "Note 2")); 
		word.add(new Word("Often", "Thuong", "Trang tu", "Note 3")); 
		word.add(new Word("Run", "Chay", "Dong tu", "Note 4")); 
				
		return word;
	}
		
	private static boolean addNewWord(Word newWord, List<Word> originWords) {
		if (originWords.contains(newWord)) {
			return false;
		}
		return originWords.add(newWord);
	}

	private static Map<String, Word> createWordMap(List<Word> words) {
		Map<String, Word> wordMap = new HashMap<String, Word>();
		for (Word word : words) {
			wordMap.put(word.getWord(), word);
			wordMap.put(word.getMeaningOfWord(), word);
		}
		return wordMap;
	}

	private static Word searchWord(String keySearch, Map<String, Word> word) {
		return word.get(keySearch);
	}

}
