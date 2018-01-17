package Players.NonMagicalPlayers;

public class Dwarf extends NonMagicalPlayer{

    private int chainmailProtection;

    public Dwarf(String name, Weapon weapon, int chainmailProtection) {
        super(name, weapon);
        this.chainmailProtection = chainmailProtection;
    }

    public int getChainmailProtection() {
        return this.chainmailProtection;
    }
}
