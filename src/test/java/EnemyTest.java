import RoomObjects.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy("Troll", 30);
    }

    @Test
    public void hasName(){
        assertEquals("Troll", enemy.getName());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(30, enemy.getAttackValue());
    }

}
