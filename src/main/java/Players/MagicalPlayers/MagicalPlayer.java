package Players.MagicalPlayers;

import Players.Player;

public abstract class MagicalPlayer extends Player{

    Spell spell;
    MythicalCreature mythicalCreature;

    public MagicalPlayer(String name, Spell spell, MythicalCreature mythicalCreature) {
        super(name);
        this.spell = spell;
        this.mythicalCreature = mythicalCreature;
    }
}
