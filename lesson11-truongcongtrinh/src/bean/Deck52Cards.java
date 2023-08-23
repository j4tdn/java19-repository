package bean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck52Cards {
    private List<Card> deck;

    public Deck52Cards() {
        deck = new ArrayList<>();
        initializeDeck();
        shuffle();
    }

    private void initializeDeck() {
        String[] types = {"Cơ", "Rô", "Chuồn", "Bích"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String type : types) {
            for (String value : values) {
                deck.add(new Card(type, value));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(deck);
    }

    public List<Card> getDeck() {
        return deck;
    }

    @Override
    public String toString() {
        return deck.toString();
    }
}
