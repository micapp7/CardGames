package player;

import model.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards = new ArrayList<>();
    
    public void addCard(Card card) {
        cards.add(card);
    }
    
    public void emptyCards() {
        for(Card card : cards) {
            cards.remove(card);
        }
    }
    
    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
