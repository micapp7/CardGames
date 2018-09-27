package model;

public class Card {
    private final Rank rank;
    private final Suit suit;


    public Card(final Rank rank, final Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.rank, this.suit);
    }
}


