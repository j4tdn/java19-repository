package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bean.Word;

public class DictionaryApp {
	public static void main(String[] args) {
		List<Word> words = mockData();

		boolean isSuccess = addNewWord(new Word("Sea2", "Bien", "Danh tu", "Ghi chu 1"), words);
		if (isSuccess) {
			System.out.println("add successful");
		} else {
			System.out.println("add failed");
		}

		for (Word word : words) {
			System.out.println(word);
		}
		System.out.println("\n======Search======");
		Map<String, Word> wordsMap = createWordMap(words);
		System.out.println(searchWord("Nui", wordsMap));
	}

	private static List<Word> mockData() {
		return new ArrayList<Word>(Arrays.asList(new Word("Sea", "Bien", "Danh tu", "Ghi chu 1"),
				new Word("Mountain", "Nui", "Danh tu", "Ghi chu 2"),
				new Word("Happy", "Vui ve", "Tinh tu", "Ghi chu 3"), new Word("Pull", "Keo", "Dong tu", "Ghi chu 4")));
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
