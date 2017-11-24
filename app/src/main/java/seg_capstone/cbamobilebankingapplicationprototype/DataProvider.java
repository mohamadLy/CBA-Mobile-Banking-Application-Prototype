package seg_capstone.cbamobilebankingapplicationprototype;

import android.media.audiofx.AcousticEchoCanceler;

import java.util.ArrayList;

import seg_capstone.cbamobilebankingapplicationprototype.account.Account;

/**
 * Created by mohamadou on 2017-11-24.
 */

public class DataProvider {
    ArrayList<Account> accounts;

    public DataProvider() {
        accounts = new ArrayList<>();
    }

    public void feedData() {
        // #1
        Account account1 = new Account("Debit", 1111111222, 500);
        accounts.add(account1);
        // #2
        Account account2 = new Account("Savings", 1116611222, 6000);
        accounts.add(account2);
        // #3
        Account account3 = new Account("Investment", 1114411222, 1500);
        accounts.add(account3);
        // #4
        Account credit = new Account("Credit", 1188111222, 1500);
        accounts.add(credit);
        // #4
        Account mortgage = new Account("Mortgage", 1771111222, 112000);
        accounts.add(mortgage);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

}
