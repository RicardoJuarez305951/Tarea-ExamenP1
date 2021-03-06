package uaslp.enginering.exam.model;

public class Reservation {
    private int roomNumber;
    private int nights;
    private String arrivalDate;
    private Guest guest;

    

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Guest getGuest() {
        return guest;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public int getNights() {
        return this.nights;
    }
}
