import java.util.ArrayList;

public class VendingMachine {

    CoinReturn coinReturn;
    ArrayList<Coin> coins;
    ArrayList<Drawer> drawers;

    public VendingMachine(CoinReturn coinReturn) {
        this.coinReturn = coinReturn;
        coins = new ArrayList<Coin>();
        drawers = new ArrayList<Drawer>();
    }

    public CoinReturn getCoinReturn() {
        return coinReturn;
    }

    public ArrayList<Coin> getCoins() {
        return coins;
    }

    public ArrayList<Drawer> getDrawers() {
        return drawers;
    }

    public void addCoinToMachine(Coin coin) {
        this.coins.add(coin);
    }

    public boolean coinCheck(Coin coin) {
        if(coin.getCoinValue() < 0.05) {
            return false;
        }
        return true;
    }
}
