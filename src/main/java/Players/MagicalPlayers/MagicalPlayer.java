package Players.MagicalPlayers;

import Actions.IAttack;
import Players.Player;
import RoomObjects.Enemy;

public abstract class MagicalPlayer extends Player implements IAttack{

    Spell spell;
    MythicalCreature mythicalCreature;

    public MagicalPlayer(String name, Spell spell, MythicalCreature mythicalCreature) {
        super(name);
        this.spell = spell;
        this.mythicalCreature = mythicalCreature;
    }

    public Spell getSpell() {
        return this.spell;
    }

    public MythicalCreature getMythicalCreature() {
        return this.mythicalCreature;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }

    public int castSpell(){
        return this.spell.getPower();
    }

    public int defend() {
        return this.mythicalCreature.getDefenceValue();
    }

    public void attack(Enemy enemy){
        enemy.sustainDamage(this.spell.getPower());
    }
}
