package Rooms;

import Players.MagicalPlayers.MagicalPlayer;
import Players.Player;
import RoomObjects.Enemy;
import RoomObjects.Treasure;

import java.util.ArrayList;

public class Room {

    private String name;
    private Treasure treasure;
    private Enemy enemy;
    private ArrayList<MagicalPlayer> players;

    public Room(String name, Treasure treasure, Enemy enemy){
        this.name = name;
        this.treasure = treasure;
        this.enemy = enemy;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }


    public int playerCount() {
        return this.players.size();
    }

    public void addPlayer(MagicalPlayer player) {
        players.add(player);
    }


    public MagicalPlayer getPlayer() {
        return this.players.get(0);
    }

    public void giveTreasure() {
    }

    public Treasure getTreasure() {
        return this.treasure;
    }

    public Enemy getEnemy() {
        return this.enemy;
    }

    public void battleMagicalPlayer() {
        if(getPlayer().castSpell() > enemy.getAttackValue()){
            getPlayer().addTreasure(this.treasure);
        }
    }
}
