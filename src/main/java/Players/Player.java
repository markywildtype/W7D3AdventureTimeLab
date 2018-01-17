package Players;

import RoomObjects.Treasure;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int healthValue;
    private ArrayList<Treasure> treasure;
    private int score;

    public Player(String name){
        this.name = name;
        this.healthValue = 100;
        this.treasure = new ArrayList<>();
        this.score = 0;
    }


    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int treasureCount() {
        return this.treasure.size();
    }

    public int getScore() {
        return this.score;
    }
}
