import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {

    CoinReturn coins;
    Coin coin1;
    Coin coin2;
    Coin coin3;
    CoinReturn coinReturn;


    @Before
    public void before(){
        coin1 = new Coin(CoinType.OnePence);
        coin2 = new Coin(CoinType.TwoPence);
        coin3 = new Coin(CoinType.OnePence);
        coinReturn = new CoinReturn(coin2);
    }

    @Test
    public void checkTotalValue(){
        coinReturn.addCoin(coin1);
        coinReturn.addCoin(coin2);
        coinReturn.addCoin(coin3);
        assertEquals(0.04, coinReturn.getTotalCoinAmount(), 0);
    }
}
