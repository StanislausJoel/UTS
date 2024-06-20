package Model.Class;

import java.sql.Date;

public class OnlinePayment extends Payment {
    
    private String serviceProvider;

    public OnlinePayment(int transactionNumber, double amount, Date transactionDate, String serviceProvider) {
        super(transactionNumber, amount, transactionDate);
        this.serviceProvider = serviceProvider;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

}
