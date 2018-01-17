package Players.MagicalPlayers;

public class Witch extends MagicalPlayer {

    private int charmValue;

    public Witch(String name, Spell spell, MythicalCreature mythicalCreature, int charmValue) {
        super(name, spell, mythicalCreature);
        this.charmValue = charmValue;
    }

    public int getCharmValue() {
        return this.charmValue;
    }

    public int castCharmSpell() {
        return getCharmValue() * this.spell.getPower();
    }
}
