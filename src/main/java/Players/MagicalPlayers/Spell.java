package Players.MagicalPlayers;

public enum Spell {

    FIREBALL(15),
    LIGHTNINGSTRIKE(13),
    STUPEFY(20),
    LEVITATE(5),
    INVISIBILITY(25),
    WIND(7),
    ACIDARROW(17),
    ARCANEHAND(10),
    BLIND(12);

    private final int power;

    Spell(int power){
        this.power = power;
    }

    public int getPower(){
        return this.power;
    }

}
