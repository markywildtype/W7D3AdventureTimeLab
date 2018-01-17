package Players.NonMagicalPlayers;

import Actions.IAttack;
import Actions.IDamage;
import Players.Player;
import RoomObjects.Enemy;

public abstract class NonMagicalPlayer extends Player implements IAttack{

    Weapon weapon;

    public NonMagicalPlayer(String name, Weapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public int getWeaponDamage() {
        return this.weapon.getDamage();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        enemy.sustainDamage(this.getWeaponDamage());
    }
}
