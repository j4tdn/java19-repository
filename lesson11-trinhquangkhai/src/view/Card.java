package view;

enum Suits {Heart, Diamond, Clubes, Spades;}
enum Cards {One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace;}


public class Card{
private Suits suit;
private Cards card;

public Card() {
}

public Card(Suits suit, Cards card) {
	super();
	this.suit = suit;
	this.card = card;
}

public Suits getSuit() {
	return suit;
}

public void setSuit(Suits suit) {
	this.suit = suit;
}

public Cards getCard() {
	return card;
}

public void setCard(Cards card) {
	this.card = card;
}

@Override
public String toString() {
	return "Card [suit=" + suit + ", card=" + card + "]";
}


}
