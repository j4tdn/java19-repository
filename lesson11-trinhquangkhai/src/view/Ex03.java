package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex03 {
public static void main(String[] args) {
	List<Card> mocktest = test();
	shuffle(mocktest);
	
}
private static List<Card> test(){
	List<Card> cards = new ArrayList<>();
	for(Suits suit: Suits.values()) {
		for(Cards card: Cards.values()) {
			Card army = new Card(suit, card);
			cards.add(army);
		}
	}
	return cards;
}
private static void shuffle(List<Card> card) {
	for(int i =0; i < 51; i++) {
		Random rd = new Random();
		int n = rd.nextInt(52);
		Card number1 = card.get(i);
		Card number2 =card.get(n);
		number1 = number2;
	}
}
private static void player(List<Card> card) {
	Players player1 = new Players();
	Players player2 = new Players();
	Players player3 = new Players();
	Players player4 = new Players();
	
	for(int i = 0; i < 52;) {
		player1.card = (List<Card>) card.get(i);
		i++;
		System.out.println();
	}
	for(int i = 0; i < 52;) {
		player2.card = (List<Card>) card.get(i);
		i++;
	}
	for(int i = 0; i < 52;) {
		player3.card = (List<Card>) card.get(i);
		i++;
	}
	for(int i = 0; i < 52;) {
		player4.card = (List<Card>) card.get(i);
		i++;
	}
	
	System.out.println();
}
}
