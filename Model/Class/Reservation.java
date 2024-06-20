package Model.Class;

import Model.Enum.ReservationStatus;
import Model.Enum.RoomStatus;

public class Reservation {

    private int IDReservation;
    private int stayDay;
    private ReservationStatus status;
    private Room room;

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

}