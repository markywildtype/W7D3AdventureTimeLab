package Players.MagicalPlayers;

public class Wizard extends MagicalPlayer{

    private int wisdom;

    public Wizard(String name, Spell spell, MythicalCreature mythicalCreature, int wisdom) {
        super(name, spell, mythicalCreature);
        this.wisdom = wisdom;
    }

    public int getWisdom() {
        return this.wisdom;
    }


    public int castWisdomSpell() {
        return this.wisdom * getSpell().getPower();
    }
}
