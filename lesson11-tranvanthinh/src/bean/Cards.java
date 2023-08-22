package bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import util.CollectionUtil;

public class Cards {
	
	private List<Card> cards;
	
	
	public Cards() {
		cards = new ArrayList<>();
		String[] types = {"cơ", "rô", "chuồn", "bích"};
		Character[] orders = {'2', '3', '4', '5', '6', '7', '8', '9', '1', 'J', 'Q', 'K', 'A'};
		for(String type : types) {
			for(Character order : orders) {
				this.cards.add(new Card(type, order));
			}
		}
	}

	public void shuffle(){
		Collections.shuffle(cards);
	}
	
	public void deal() {
		for(int i = 0; i < 4; i++) {
			List<Card> dealedCards = new ArrayList<>();
			for(Card card : cards.subList(0, 13)) {
				dealedCards.add(card);
			}
			CollectionUtil.generate("Dealed " + (i + 1), dealedCards);
			cards.removeAll(dealedCards);
		}
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
