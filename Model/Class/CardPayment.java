package Model.Class;

import java.sql.Date;

public class CardPayment extends Payment {
    
    private String cardType;
    private String cardNumber;

    public CardPayment(int transactionNumber, double amount, Date transactionDate, String cardType, String cardNumber) {
        super(transactionNumber, amount, transactionDate);
        this.cardType = cardType;
        this.cardNumber = cardNumber;
    }
    
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
