import Players.NonMagicalPlayers.Knight;
import Players.NonMagicalPlayers.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Brave Sir Robin", Weapon.SWORD, 15);
    }

    @Test
    public void hasArmourProtection(){
        assertEquals(15, knight.getArmourProtection());
    }
}
