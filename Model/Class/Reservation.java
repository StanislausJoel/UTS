package Model.Class;

import Model.Enum.ReservationStatus;

public class Reservation {

    private int IDReservation;
    private int stayDay;
    private ReservationStatus status;

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

}