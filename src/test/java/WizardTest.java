import Players.MagicalPlayers.MythicalCreature;
import Players.MagicalPlayers.Spell;
import Players.MagicalPlayers.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Gandalf", Spell.FIREBALL, MythicalCreature.OGRE, 4);
    }

    @Test
    public void hasWisdom(){
        assertEquals(4, wizard.getWisdom());
    }

    @Test
    public void canCastSpell(){
        assertEquals(15, wizard.castSpell());
    }

    @Test
    public void castWisdomSpell(){
        assertEquals(60, wizard.castWisdomSpell());
    }

    @Test
    public void canDefendWithCreature(){
        assertEquals(13, wizard.defend());
    }
}
