package player;

public class PokerPlayer implements IPlayer {

    private String name;
    private int chipCount;
    private Hand hand = new Hand();
    private boolean isDealer;

    public PokerPlayer(String name, boolean isDealer) {
        this.name = name;
        this.isDealer = isDealer;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Hand getHand() {
        return hand;
    }

    @Override
    public int getChipCount() {
        return chipCount;
    }

    public void setChipCount(int chipCount) {
        this.chipCount = chipCount;
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }


    public boolean isDealer() {
        return isDealer;
    }

    public int bet(int amount) {
        if (amount <= chipCount) {
            chipCount -= amount;
            return chipCount;
        }
        return -1;
    }

    public void check() {
        System.out.println(name + " " + "checks");
    }

    public void fold() {
        System.out.println(name + " " + "folds");
    }
}
