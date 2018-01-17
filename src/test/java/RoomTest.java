import Players.MagicalPlayers.MagicalPlayer;
import Players.MagicalPlayers.MythicalCreature;
import Players.MagicalPlayers.Spell;
import Players.MagicalPlayers.Witch;
import Players.NonMagicalPlayers.Barbarian;
import Players.NonMagicalPlayers.NonMagicalPlayer;
import Players.NonMagicalPlayers.Weapon;
import Players.Player;
import RoomObjects.Enemy;
import RoomObjects.Treasure;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room1;
    MagicalPlayer player;
    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy("Rancor", 12);
        room1 = new Room("Trophy Chamber", Treasure.TROPHIES, enemy);
        player = new Witch("Jeff", Spell.FIREBALL, MythicalCreature.OGRE, 3 );
    }

    @Test
    public void hasName(){
        assertEquals("Trophy Chamber", room1.getName());
    }

    @Test
    public void hasTreasure(){
        assertEquals(Treasure.TROPHIES, room1.getTreasure());
    }

    @Test
    public void hasEnemy(){
        assertEquals(enemy, room1.getEnemy());
    }

    @Test
    public void roomPlayersStartsAt0(){
        assertEquals(0, room1.playerCount());
    }

    @Test
    public void canAddPlayerToRoom(){
        room1.addPlayer(player);
        assertEquals(1, room1.playerCount());
    }

    @Test
    public void canGetPlayer(){
        room1.addPlayer(player);
        assertEquals(player, room1.getPlayer());
    }

    @Test
    public void canAddTreasureToPlayerAfterBattle(){
        room1.addPlayer(player);
        room1.battleMagicalPlayer();
        room1.giveTreasure();
        assertEquals(1, player.treasureCount());
        assertEquals(20, player.getScore());
    }
}
