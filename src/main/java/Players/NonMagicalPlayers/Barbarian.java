package Players.NonMagicalPlayers;

import Actions.IAttack;
import RoomObjects.Enemy;

public class Barbarian extends NonMagicalPlayer {

    private int berzerkerValue;

    public Barbarian(String name, Weapon weapon, int berzerkerValue) {
        super(name, weapon);
        this.berzerkerValue = berzerkerValue;
    }

    public int getBerzerkerValue(){
        return this.berzerkerValue;
    }

    public int berzerkerAttack(){
        return this.berzerkerValue * getWeaponDamage();
    }

}
