package Rooms;

import Players.Player;

import java.util.ArrayList;

public class Room<T> {

    private String name;
    private T play;
    private ArrayList<Player> players;

    public Room(String name, T play){
        this.name = name;
        this.play = play;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public T getPlay() {
        return this.play;
    }

    public int playerCount() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
