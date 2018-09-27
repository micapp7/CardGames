package dealer;

import model.Card;
import model.Rank;
import model.Suit;

import java.util.*;

public class Deck {
    private final static Map<String, Card> CARD_CACHE = initCache();
    private final Stack<Card> cardDeck;

    public Deck() {
        this.cardDeck = initDeck();
    }

     public void shuffle() {
        Collections.shuffle(cardDeck);
    }

     Optional<Card> deal() {
        return this.cardDeck.empty() ? Optional.empty() : Optional.of(this.cardDeck.pop());
    }

    private static Map<String,Card> initCache() {
        final Map<String, Card> cache = new HashMap<>();

        for(final Suit suit : Suit.values()) {
            for(final Rank rank : Rank.values()) {
                cache.put(cardKey(rank, suit), new Card(rank, suit));
            }
        }

        return Collections.unmodifiableMap(cache);
    }

    private Stack<Card> initDeck() {
        final Stack<Card> cardDeck = new Stack<>();

        for (final Suit suit : Suit.values()) {
            for (final Rank rank : Rank.values()) {
                cardDeck.push(getCachedCard(rank, suit)); 
            }
        }
        return cardDeck;
    }

    private static String cardKey(final Rank rank,
                                  final Suit suit) {
        return rank + " of " + suit;
    }

    // Avoid adding new cards when game is reset.
     private static Card getCachedCard(final Rank rank,
                                 final Suit suit) {
        final Card card = CARD_CACHE.get(cardKey(rank, suit));

        if(card != null) {
            return card;
        }

        throw new RuntimeException("Invalid cards! " + rank + " " + suit);

    }
}
