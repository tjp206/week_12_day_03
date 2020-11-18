public class Coin {

    CoinType coinType;

    public Coin(CoinType coinType) {
        this.coinType = coinType;
    }

    public CoinType getCoinType() {
        return coinType;
    }
    
    public double getCoinValue() {
        return coinType.getValue();
    }

    
}
