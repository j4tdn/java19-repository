package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import bean.Card;
import cardEnum.TypeCardEnum;
import cardEnum.ValueCardEnum;

public class CardGameApp {
	public static void main(String[] args) {
		List<Card> cards = createDeck();
		
//		for (Card card : createDeck()) {
//			System.out.println(card);
//		}
		System.out.println("====Deal card=====");
		int indexPlayer = 1;
		for (List<Card> cardsForOnePlayer : dealCard(cards)) {
			System.out.println("\n----Player " + indexPlayer++ + "----");
			for (Card card : cardsForOnePlayer) {
				System.out.println(card);
			}

		}
		
	}
	
	public static List<Card> createDeck(){
		List<Card> deck = new ArrayList<Card>(52);
		List<TypeCardEnum> typeCards = Arrays.asList(TypeCardEnum.values());
		List<ValueCardEnum> valueCards = Arrays.asList(ValueCardEnum.values());
		for(TypeCardEnum typeCard : typeCards) {
			for(ValueCardEnum valueCard : valueCards) {
				deck.add(new Card(typeCard, valueCard));
			}
		}
		
		return deck;
	}
	
	public static List<List<Card>> dealCard(List<Card> cards){
		Collections.shuffle(cards);
		int numberOfPlayer = 4;
		int cardsPerPlayer = cards.size()/4;
		List<List<Card>> result = new ArrayList<List<Card>>();
		
		for(int i = 0; i < numberOfPlayer; i++) {
			List<Card> hand = new ArrayList<Card>();
			for(int j = 0; j < cardsPerPlayer; j++) {
				hand.add(cards.remove(0));
			}
			result.add(hand);		
		}
		return result;
	}
}
