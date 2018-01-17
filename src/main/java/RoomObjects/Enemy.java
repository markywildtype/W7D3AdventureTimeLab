package RoomObjects;

import Actions.IDamage;

public class Enemy implements IDamage{

    private String name;
    private int attackValue;
    private int healthValue;

    public Enemy(String name, int attackValue, int healthValue){
        this.name = name;
        this.attackValue = attackValue;
        this.healthValue = healthValue;
    }

    public String getName() {
        return this.name;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public void sustainDamage(int damage){
        this.healthValue -= damage;
    }
}
