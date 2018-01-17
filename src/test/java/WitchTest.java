import Players.MagicalPlayers.MythicalCreature;
import Players.MagicalPlayers.Spell;
import Players.MagicalPlayers.Witch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WitchTest {

    Witch witch;

    @Before
    public void before(){
        witch = new Witch("Zelda", Spell.INVISIBILITY, MythicalCreature.UNICORN, 3);
    }

    @Test
    public void hasSpell(){
        assertEquals(Spell.INVISIBILITY, witch.getSpell());
    }

    @Test
    public void hasMythicalCreature(){
        assertEquals(MythicalCreature.UNICORN, witch.getMythicalCreature());
    }

    @Test
    public void hasCharmValue(){
        assertEquals(3, witch.getCharmValue());
    }

    @Test
    public void canSetSpell(){
        witch.setSpell(Spell.LEVITATE);
        assertEquals(Spell.LEVITATE, witch.getSpell());
    }

    @Test
    public void canSetMythicalCreature(){
        witch.setMythicalCreature(MythicalCreature.DRAGON);
        assertEquals(MythicalCreature.DRAGON, witch.getMythicalCreature());
    }

    @Test
    public void canCastSpell(){
        assertEquals(75, witch.castCharmSpell());
    }

}
