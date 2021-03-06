package uaslp.enginering.exam.model;

public class Room {
    int number;
    public String description;
    public RoomStatus status;


    public Room(int room, String bedDescription, RoomStatus status) {
        this.number = room;
        this.description = bedDescription;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public RoomStatus getStatus() {
        return status;
    }
}
