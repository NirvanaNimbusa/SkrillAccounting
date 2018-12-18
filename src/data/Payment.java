package data;

public class Payment {
    private String id;
    private String date;
    private String type;
    private String transactionDetails;
    private double minusPln;
    private double plusPln;
    private String status;
    private double balance;
    private String reference;
    private double amountSent;
    private String currencySent;
    private String moreInformation;
    private String skrillSender;

    Payment(String id, String date, String type, String transactionDetails, double minusPln, double plusPln, String status, double balance, String reference, double amountSent, String currencySent, String moreInformation, String skrillSender) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.transactionDetails = transactionDetails;
        this.minusPln = minusPln;
        this.plusPln = plusPln;
        this.status = status;
        this.balance = balance;
        this.reference = reference;
        this.amountSent = amountSent;
        this.currencySent = currencySent;
        this.moreInformation = moreInformation;
        this.skrillSender = skrillSender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public double getMinusPln() {
        return minusPln;
    }

    public void setMinusPln(double minusPln) {
        this.minusPln = minusPln;
    }

    public double getPlusPln() {
        return plusPln;
    }

    public void setPlusPln(double plusPln) {
        this.plusPln = plusPln;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getAmountSent() {
        return amountSent;
    }

    public void setAmountSent(double amountSent) {
        this.amountSent = amountSent;
    }

    public String getCurrencySent() {
        return currencySent;
    }

    public void setCurrencySent(String currencySent) {
        this.currencySent = currencySent;
    }

    public String getMoreInformation() {
        return moreInformation;
    }

    public void setMoreInformation(String moreInformation) {
        this.moreInformation = moreInformation;
    }

    public String getSkrillSender() {
        return skrillSender;
    }

    public void setSkrillSender(String skrillSender) {
        this.skrillSender = skrillSender;
    }
}
