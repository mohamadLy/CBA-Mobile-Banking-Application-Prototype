package seg_capstone.cbamobilebankingapplicationprototype.Account;

/**
 * Created by mohamadou on 2017-11-23.
 */

public class Account {
    private String type;
    private String accountNumber;
    private String balance;

    public Account() {}

    public Account(String type, String accountNumber, String balance) {
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
    public void test() {}
}