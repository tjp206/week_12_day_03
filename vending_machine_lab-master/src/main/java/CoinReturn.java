import java.util.ArrayList;

public class CoinReturn {
    Coin coin;
    private ArrayList<Coin> coins;

    public CoinReturn(Coin coin) {
        this.coin = coin;
        coins = new ArrayList<Coin>();
    }

    public Coin getCoin() {
        return coin;
    }

    public ArrayList<Coin> getCoins() {
        return coins;
    }

    public double getTotalCoinAmount(){
        double total = 0;
        for(Coin coin : coins) {
            total += coin.getCoinValue();
        }
        return total;
    }

    public void addCoin(Coin coin) {
            coins.add(coin);
    }
}
