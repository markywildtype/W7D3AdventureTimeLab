import RoomObjects.Treasure;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room<Treasure> room1;

    @Before
    public void before(){
        room1 = new Room("Trophy Chamber", Treasure.TROPHIES);
    }

    @Test
    public void hasName(){
        assertEquals("Trophy Chamber", room1.getName());
    }

    @Test
    public void hasTreasure(){
        assertEquals(Treasure.TROPHIES, room1.getPlay());
    }
}
