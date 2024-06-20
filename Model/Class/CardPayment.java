package Model.Class;

public class CardPayment extends Payment {
    
    private String cardType;
    private String cardNumber;

    public String getCardType() {
        return cardType;
    }
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        
    }

}
