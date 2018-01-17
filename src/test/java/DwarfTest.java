import Players.NonMagicalPlayers.Dwarf;
import Players.NonMagicalPlayers.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Gimli", Weapon.AXE, 10);
    }

    @Test
    public void dwarfHasName(){
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void healthValueStartsAt100(){
        assertEquals(100, dwarf.getHealthValue());
    }

    @Test
    public void treasureStartsEmpty(){
        assertEquals(0, dwarf.treasureCount());
    }

    @Test
    public void scoreStartsAt0(){
        assertEquals(0, dwarf.getScore());
    }
}
