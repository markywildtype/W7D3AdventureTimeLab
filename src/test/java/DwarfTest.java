import Players.NonMagicalPlayers.Dwarf;
import Players.NonMagicalPlayers.Weapon;
import RoomObjects.Treasure;
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

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.AXE, dwarf.getWeapon());
    }

    @Test
    public void weaponHasDamage(){
        assertEquals(15, dwarf.getWeaponDamage());
    }

    @Test
    public void hasChainmailProtection(){
        assertEquals(10, dwarf.getChainmailProtection());
    }

    @Test
    public void canAddToScore(){
        dwarf.addToScore(10);
        assertEquals(10, dwarf.getScore());
    }

    @Test
    public void canSetWeapon(){
        dwarf.setWeapon(Weapon.STAFF);
        assertEquals(Weapon.STAFF, dwarf.getWeapon());
    }

    @Test
    public void canDecreaseHealthValue(){
        dwarf.decreaseHealthValue(10);
        assertEquals(90, dwarf.getHealthValue());
    }

    @Test
    public void canIncreaseHealthValue(){
        dwarf.increaseHealthValue(10);
        assertEquals(110, dwarf.getHealthValue());
    }

    @Test
    public void canAddTreasure(){
        dwarf.addTreasure(Treasure.GOLD);
        assertEquals(1, dwarf.treasureCount());
    }

    @Test
    public void treasureValueAddsToScore(){
        dwarf.addTreasure(Treasure.GOLD);
        assertEquals(10, dwarf.getScore());
    }

}
