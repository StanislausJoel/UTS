package Model.Class;

import Model.Enum.ReservationStatus;
import Model.Enum.RoomStatus;

public class Reservation {

    private int IDReservation;
    private int stayDay;
    private ReservationStatus status;
    private Room room;
    private Customer customer;
    private Payment payment;
    
    public Reservation(int iDReservation, int stayDay, Room room, Customer customer) {
        IDReservation = iDReservation;
        this.stayDay = stayDay;
        this.room = room;
        this.customer = customer;
    }

    public int getIDReservation() {
        return IDReservation;
    }
    public void setIDReservation(int iDReservation) {
        IDReservation = iDReservation;
    }
    public int getStayDay() {
        return stayDay;
    }
    public void setStayDay(int stayDay) {
        this.stayDay = stayDay;
    }
    public ReservationStatus getStatus() {
        return status;
    }
    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
    public void bookRoom(Room room) {
        this.room = room;
    }    
    public void cancelBooking() {
        this.room = null;
    }    
    public RoomStatus checkAvailability() {
        return this.room.getStatus();
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    

}