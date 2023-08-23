package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bean.Word;

public class Ex04EnglishDictionaryApp {
    private Map<String, Word> wordMap;

    public Ex04EnglishDictionaryApp() {
        wordMap = new HashMap<>();
    }

    public void addWord(String word, String meaning, String wordType, String note) {
        Word newWord = new Word(word, meaning, wordType, note);
        wordMap.put(word.toLowerCase(), newWord);
        System.out.println("Added Successfully!");
    }

    public void lookupWord(String word) {
        Word foundWord = wordMap.get(word.toLowerCase());
        if (foundWord != null) {
            System.out.println("Word: " + foundWord.getWord());
            System.out.println("Definition: " + foundWord.getMeaning());
            System.out.println("Part of speech: " + foundWord.getWordType());
            System.out.println("Note: " + foundWord.getNote());
        } else {
            System.out.println("Not found!");
        }
    }

    public static void main(String[] args) {
        Ex04EnglishDictionaryApp dictionary = new Ex04EnglishDictionaryApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- English Dictionary -----");
            System.out.println("1. Add new word");
            System.out.println("2. Look up");
            System.out.println("3. Exit");
            System.out.println("--------------------------------");
            System.out.print("Your selection: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter definition: ");
                    String meaning = scanner.nextLine();
                    System.out.print("Enter part of speech: ");
                    String wordType = scanner.nextLine();
                    System.out.print("Enter note: ");
                    String note = scanner.nextLine();

                    dictionary.addWord(word, meaning, wordType, note);
                    break;

                case 2:
                    System.out.print("Enter Word For Look Up: ");
                    String lookupWord = scanner.nextLine();
                    dictionary.lookupWord(lookupWord);
                    break;

                case 3:
                    System.out.println("Exit Successfully!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice! Select again!");
                    break;
            }
        }
    }
}