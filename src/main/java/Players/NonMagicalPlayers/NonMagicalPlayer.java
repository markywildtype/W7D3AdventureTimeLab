package Players.NonMagicalPlayers;

import Players.Player;

public abstract class NonMagicalPlayer extends Player{

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
}
