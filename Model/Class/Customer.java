package Model.Class;

import java.util.List;

public class Customer {
    
    private int IDCustomer;
    private String name;
    private String email;
    private String company;
    private List<Reservation> listReservations;

    public int getIDCustomer() {
        return IDCustomer;
    }
    public void setIDCustomer(int iDCustomer) {
        IDCustomer = iDCustomer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public List<Reservation> getListReservations() {
        return listReservations;
    }
    public void setListReservations(List<Reservation> listReservations) {
        this.listReservations = listReservations;
    }

}
