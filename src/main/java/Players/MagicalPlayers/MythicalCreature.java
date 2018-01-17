package Players.MagicalPlayers;

public enum MythicalCreature {

    OGRE(13),
    DRAGON(24),
    UNICORN(8);


    private final int defenceValue;

    MythicalCreature(int defenceValue){
        this.defenceValue = defenceValue;
    }

    public int getDefenceValue(){
        return this.defenceValue;
    }

}
