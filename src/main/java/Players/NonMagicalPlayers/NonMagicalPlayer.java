package Players.NonMagicalPlayers;

import Players.Player;

public abstract class NonMagicalPlayer extends Player{

    Weapon weapon;

    public NonMagicalPlayer(String name, Weapon weapon) {
        super(name);
        this.weapon = weapon;
    }
}
