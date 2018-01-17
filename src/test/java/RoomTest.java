import Players.NonMagicalPlayers.Barbarian;
import Players.NonMagicalPlayers.NonMagicalPlayer;
import Players.NonMagicalPlayers.Weapon;
import Players.Player;
import RoomObjects.Treasure;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room<Treasure> room1;
    Player player;

    @Before
    public void before(){
        room1 = new Room("Trophy Chamber", Treasure.TROPHIES);
        player = new Barbarian("Jeff", Weapon.MORNINGSTAR, 2);
    }

    @Test
    public void hasName(){
        assertEquals("Trophy Chamber", room1.getName());
    }

    @Test
    public void hasTreasure(){
        assertEquals(Treasure.TROPHIES, room1.getPlay());
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
}
