import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {
    Coin coin;

    @Before
    public void before() {
        coin = new Coin(CoinType.OnePence);
    }

    @Test
    public void canCheckValue() {
        assertEquals(0.01, coin.getCoinValue(), 0);
    }
}
