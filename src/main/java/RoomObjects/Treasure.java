package RoomObjects;

public enum Treasure {

    GOLD(10),
    SILVER(8),
    COINS(2),
    JEWELLERY(4),
    PEARLS(6),
    DIAMONDS(15),
    RUBIES(12),
    TROPHIES(20);

    private final int value;

    Treasure(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
