package view;

import java.util.ArrayList;
import java.util.List;

import bean.Card;
import bean.Deck52Cards;

public class Ex03CardPlayApp {
	public static void main(String[] args) {
		Deck52Cards cardDeck = new Deck52Cards();
		List<Card> deck = cardDeck.getDeck();

		List<List<Card>> players = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			players.add(new ArrayList<>());
		}

		int playerIndex = 0;

		for (Card card : deck) {
			players.get(playerIndex).add(card);
			playerIndex = (playerIndex + 1) % 4;
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("Player " + (i + 1) + "'s hand:");
			for (Card card : players.get(i)) {
				System.out.println(card);
			}
			System.out.println();
		}
	}
}