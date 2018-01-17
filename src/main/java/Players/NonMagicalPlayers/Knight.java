package Players.NonMagicalPlayers;

public class Knight extends NonMagicalPlayer{

    private int armourProtection;

    public Knight(String name, Weapon weapon, int armourProtection) {
        super(name, weapon);
        this.armourProtection = armourProtection;
    }

    public int getArmourProtection() {
        return this.armourProtection;
    }
}
