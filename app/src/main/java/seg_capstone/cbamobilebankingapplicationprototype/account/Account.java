package seg_capstone.cbamobilebankingapplicationprototype.account;

/**
 * Created by mohamadou on 2017-11-23.
 */

public class Account {
    private String type;
    private double accountNumber;
    private double balance;

    public Account() {}

    public Account(String type, double accountNumber, double balance) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
