package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private ArrayList<Room> rooms;
    private String name;
    private int pool;
    private int gym;

    public Hotel(String comfort_poo_inn) {
        name = comfort_poo_inn;
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
        pool = 2;
        gym = 1;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getPool(){
        return pool;
    }

    public int  getGym(){
        return gym;
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);


        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }


    public void addRoom(Room room) {
        this.rooms.add(room);
    }
}
