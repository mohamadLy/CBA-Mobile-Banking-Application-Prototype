package seg_capstone.cbamobilebankingapplicationprototype.dataProvider;

import android.media.audiofx.AcousticEchoCanceler;

import java.util.ArrayList;

import seg_capstone.cbamobilebankingapplicationprototype.account.Account;

/**
 * Created by mohamadou on 2017-11-24.
 */

public class AccountProvider {
    ArrayList<Account> accounts;

    public AccountProvider() {
        accounts = new ArrayList<>();
    }

    public void feedData() {
        // Deposit Accounts
        Account deposit = new Account("Deposit Accounts", "", "3 ACCOUNTS");
        accounts.add(deposit);
        // #1
        Account account1 = new Account("Debit", 1111222 + "-" + 32344, "$500");
        accounts.add(account1);
        // #2
        Account account2 = new Account("Savings", 11166112 + "-" + 24334, "$600");
        accounts.add(account2);
        // #3
        Account account3 = new Account("Investment", 11144112 + "-" + 98441, "$1500");
        accounts.add(account3);

        Account totalDeposit = new Account("TOTAL CAD $ ACCOUNTS", "", "$2600");
        accounts.add(totalDeposit);

        Account credits = new Account("Credit Accounts", "", "2 ACCOUNTS");
        accounts.add(credits);
        // #4
        Account credit = new Account("Credit", 1188222 + "-" + 23244, "$1500");
        accounts.add(credit);
        // #4
        Account mortgage = new Account("Mortgage", 177122 + "-" + 43341, "$112000");
        accounts.add(mortgage);

        Account totalCredit = new Account("TOTAL CAD $ ACCOUNTS", "", "$114600");
        accounts.add(totalCredit);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

}
