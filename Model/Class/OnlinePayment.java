package Model.Class;

public class OnlinePayment extends Payment {
    
    private String serviceProvider;

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

}
