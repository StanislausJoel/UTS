package Model.Class;

import java.util.List;

import Model.Enum.RoomStatus;

public class Room {
    
    private int roomNumber;
    private int floor;
    private double price;
    private int capacity;
    private RoomStatus status;
    private List<Reservation> listReservations;

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public RoomStatus getStatus() {
        return status;
    }
    public void setStatus(RoomStatus status) {
        this.status = status;
    }
    public List<Reservation> getListReservations() {
        return listReservations;
    }
    public void setListReservations(List<Reservation> listReservations) {
        this.listReservations = listReservations;
    }

}