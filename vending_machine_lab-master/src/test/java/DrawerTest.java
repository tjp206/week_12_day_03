import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Drawer drawer;
    Candy candy;

    @Before
    public void before() {
        candy = new Candy("Mars", "Nestle");
        drawer = new Drawer(Code.A1, 0.50);
    }

    @Test
    public void checkDrawer() {
//        drawer.addProductToDrawer(candy);
        assertEquals("Mars", drawer.addProductToDrawer(candy));
    }
}
