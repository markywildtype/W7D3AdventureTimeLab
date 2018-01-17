package RoomObjects;

public class Enemy {

    private String name;
    private int attackValue;

    public Enemy(String name, int attackValue){
        this.name = name;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.name;
    }

    public int getAttackValue() {
        return this.attackValue;
    }
}
