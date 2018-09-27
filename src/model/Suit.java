package model;

public enum Suit {
    CLUBS(1),
    HEARTS(2),
    DIAMONDS(3),
    SPADES(4);

    private final int suitValue;

    Suit(final int suitValue) {
        this.suitValue = suitValue;
    }

    public int getSuitValue() {
        return suitValue;
    }
}
