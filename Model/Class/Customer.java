package Model.Class;

public class Customer {
    
    private int IDCustomer;
    private String name;
    private String email;
    private String company;

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

}
