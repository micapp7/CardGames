package dealer;

import player.IPlayer;
import java.util.List;

public interface IDealer {
    void shuffleDeck();
    void deal(List<? extends IPlayer> players);
}
