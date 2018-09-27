package dealer;

import player.IPlayer;

import java.util.List;

//TODO: Flop, Turn, River
public class Dealer implements IDealer {
    private final Deck deck = new Deck();
    private int numCardsToDeal;
    private EGameType gameType;

    public Dealer(EGameType gameType) {
        this.gameType = gameType;
        init();
    }

    @Override
    public void shuffleDeck() {
        deck.shuffle();
    }

    @Override
    public void deal(List<? extends IPlayer> players) {
        for (int i = 0; i < numCardsToDeal; i++) {
            for (IPlayer player : players) {
                if (deck.deal().isPresent()) {
                    player.getHand().addCard(deck.deal().get());
                }
            }
        }
    }

    private void init() {
        switch (gameType) {
            case POKER:
                numCardsToDeal = 2;
                System.out.println("Let's play poker!");
                break;
            case BLACKJACK:
                numCardsToDeal = 2;
                System.out.println("Let's play Blackjack!");
                break;
        }
    }
}
