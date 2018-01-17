import Players.NonMagicalPlayers.Barbarian;
import Players.NonMagicalPlayers.Weapon;
import Players.Player;
import RoomObjects.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;
    Barbarian barbarian;

    @Before
    public void before(){
        enemy = new Enemy("Troll", 30, 50);
        barbarian = new Barbarian("Conan", Weapon.CLUB,2);
    }

    @Test
    public void hasName(){
        assertEquals("Troll", enemy.getName());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(30, enemy.getAttackValue());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(50, enemy.getHealthValue());
    }

    @Test
    public void canSustainDamage(){
        enemy.sustainDamage(13);
        assertEquals(37, enemy.getHealthValue());
    }

}
