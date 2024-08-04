package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<>();

    public Deck() {
        init();
        shuffle();
    }

    private void init() {
        CardShape[] cardShapes = CardShape.values();

        for (int i = 0; i < 13; i++) {
            for (CardShape cardShape : cardShapes) {
                deck.add(new Card(cardShape, i + 1));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(deck);
    }

    public Card drawCard() {
        return deck.remove(0);
    }
}
