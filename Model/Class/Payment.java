package Model.Class;

import java.sql.Date;

public class Payment {
    
    private int transactionNumber;
    private double amount;
    private Date transactionDate;

    public int getTransactionNumber() {
        return transactionNumber;
    }
    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

}
