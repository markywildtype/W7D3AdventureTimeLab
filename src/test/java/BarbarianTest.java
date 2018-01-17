import Players.NonMagicalPlayers.Barbarian;
import Players.NonMagicalPlayers.Weapon;
import RoomObjects.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Enemy enemy;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", Weapon.CLUB,2);
        enemy = new Enemy("Orc", 11, 50);
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

    @Test
    public void canAddToScore(){
        barbarian.addToScore(5);
        assertEquals(5, barbarian.getScore());
    }

    @Test
    public void canAttack(){
        int result = enemy.getHealthValue() - barbarian.getWeaponDamage();
        barbarian.attack(enemy);
        assertEquals(41, result);
    }
}
