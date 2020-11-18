import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    CoinReturn coinReturn;
    Coin coin1;
    Coin coin2;

    @Before
    public void before() {
        vendingMachine = new VendingMachine(coinReturn);
        coin1 = new Coin(CoinType.OnePence);
        coin2 = new Coin(CoinType.TwoPence);
    }

    @Test
    public void checkUnder5Pence() {
        assertEquals(false, vendingMachine.coinCheck(coin1));
    }
}
