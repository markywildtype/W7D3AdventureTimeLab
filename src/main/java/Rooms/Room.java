package Rooms;

public class Room<T> {

    private String name;
    private T play;

    public Room(String name, T play){
        this.name = name;
        this.play = play;
    }

    public String getName() {
        return this.name;
    }

    public T getPlay() {
        return this.play;
    }
}
