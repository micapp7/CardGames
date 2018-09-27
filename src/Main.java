import dealer.Dealer;
import dealer.EGameType;
import player.PokerPlayer;

import java.util.ArrayList;
import java.util.List;



//TODO: Pot win Condition

public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer(EGameType.POKER);
        PokerPlayer player1 = new PokerPlayer("Player1", false);
        PokerPlayer player2 = new PokerPlayer("Player2", true);

        List<PokerPlayer> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        dealer.shuffleDeck();
        dealer.deal(players);

        for(PokerPlayer player : players) {
            System.out.println(player.getName() + "'s Hand" + " " + player.getHand().toString());
        }
    }
}
