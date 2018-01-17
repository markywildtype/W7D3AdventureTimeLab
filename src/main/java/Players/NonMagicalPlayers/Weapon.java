package Players.NonMagicalPlayers;

import sun.tools.tree.AssignBitXorExpression;

public enum Weapon {
    SWORD(12),
    AXE(15),
    CLUB(9),
    MORNINGSTAR(14),
    DAGGER(7),
    STAFF(5),
    POISON(20);

    private final int damage;

    Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }

}
