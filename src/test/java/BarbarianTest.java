import Players.NonMagicalPlayers.Barbarian;
import Players.NonMagicalPlayers.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", Weapon.CLUB,2);
    }

    @Test
    public void hasBerzerkerValue(){
        assertEquals(2, barbarian.getBerzerkerValue());
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void healthValueStartsAt100(){
        assertEquals(100, barbarian.getHealthValue());
    }

    @Test
    public void treasureStartsEmpty(){
        assertEquals(0, barbarian.treasureCount());
    }

    @Test
    public void scoreStartsAt0(){
        assertEquals(0, barbarian.getScore());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.CLUB, barbarian.getWeapon());
    }

    @Test
    public void weaponHasDamage(){
        assertEquals(9, barbarian.getWeaponDamage());
    }

    @Test
    public void berzerkerAttackMultipliesDamage(){
        assertEquals(18, barbarian.berzerkerAttack());
    }
}
