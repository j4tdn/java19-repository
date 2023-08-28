package view;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	Dictionary dictionary = new Dictionary();
	Scanner ip = new Scanner(System.in);
	while(true) {
		System.out.println("======DICTIONARY======");
		System.out.println("1. Enter new word");
		System.out.println("2. Look up");
		System.out.println("3. Exit");
		System.out.println("4. Enter your choice: ");
		int choice = ip.nextInt();
		ip.nextLine();
		
		switch(choice) {
		case 1: 
			System.out.println("Enter new word: ");
			String word = ip.nextLine();
			System.out.println("Enter the meaning: ");
			String meaning = ip.nextLine();
			System.out.println("Enter the kind of word: ");
			String wordType = ip.nextLine();
			System.out.println("Enter the note: ");
			String note = ip.nextLine();
			dictionary.addWord(word, meaning, wordType, note);
			break;
			
		case 2: 
			System.out.println("Enter the word to look up: ");
			String lookupWord = ip.nextLine();
			dictionary.lookUpWord(lookupWord);
			break;
			
		case 3:
			System.out.println("Exit the program");
			System.exit(0);
			break;
			default: 
				System.out.println("Your choice is invalid. Try again, please!");
				break;
		}
		System.out.println();
			
	}
}

}
