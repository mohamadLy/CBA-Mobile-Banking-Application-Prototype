package seg_capstone.cbamobilebankingapplicationprototype.DataProviders;

import java.util.ArrayList;

import seg_capstone.cbamobilebankingapplicationprototype.Classes.ExpandListGroup;
import seg_capstone.cbamobilebankingapplicationprototype.Classes.ExpandListItem;


public final class DataProvider {

    private DataProvider(){}        // Private constructor to avoid instantiation

    public static ArrayList<ExpandListGroup> getMainScreenGroups(){
        ArrayList<ExpandListGroup> groups = new ArrayList<ExpandListGroup>();
        ExpandListGroup accountOverview = getAccountOverviewGroup();
        ExpandListGroup recentTransactions = getRecentTransactionsGroup();

        groups.add(accountOverview);
        groups.add(recentTransactions);
        return groups;
    }

    private static ExpandListGroup getRecentTransactionsGroup() {
        ExpandListGroup grp = new ExpandListGroup("Recent Transactions");
        ArrayList<ExpandListItem> items = getRecentTransactionsItems();
        grp.setItems(items);
        return grp;
    }

    private static ArrayList<ExpandListItem> getAccountOverviewItems() {
        ArrayList<ExpandListItem> items = new ArrayList<ExpandListItem>();
        
        ExpandListItem chequingAccount = new ExpandListItem("CHEQUING", "(987-1234)", "$507.89");
        items.add(chequingAccount);

        ExpandListItem savingsAccount = new ExpandListItem("SAVINGS", "(987-5678)", "$1304.18");
        items.add(savingsAccount);

        ExpandListItem creditLine = new ExpandListItem("CREDIT LINE", "(456-765432)", "$2194.07");
        items.add(creditLine);
        
        return items;
    }

    private static ExpandListGroup getAccountOverviewGroup() {
        ExpandListGroup grp = new ExpandListGroup("Account Overview");
        ArrayList<ExpandListItem> items = getAccountOverviewItems();
        grp.setItems(items);
        return grp;
    }

    private static ArrayList<ExpandListItem> getRecentTransactionsItems() {
        ArrayList<ExpandListItem> items = new ArrayList<ExpandListItem>();

        items.add(new ExpandListItem("McDonald", "chequing - 2017/11/27", "- $13.65"));
        items.add(new ExpandListItem("McDonald", "chequing - 2017/11/27", "$13.65"));
        items.add(new ExpandListItem("McDonald", "chequing - 2017/11/27", "$13.65"));
        items.add(new ExpandListItem("McDonald", "chequing - 2017/11/27", "- $13.65"));
        items.add(new ExpandListItem("McDonald", "chequing - 2017/11/27", "$13.65"));
        items.add(new ExpandListItem("McDonald", "chequing - 2017/11/27", "- $13.65"));
        items.add(new ExpandListItem("McDonald", "chequing - 2017/11/27", "- $13.65"));
        items.add(new ExpandListItem("McDonald", "chequing - 2017/11/27", "$13.65"));
        return items;
    }

    /*public void feedData() {
        // Deposit Accounts
        ExpandListItem deposit = new ExpandListItem("Deposit Accounts", "", "3 ACCOUNTS");
        accounts.add(deposit);
        // #1
        ExpandListItem account1 = new ExpandListItem("Debit", 1111222 + "-" + 32344, "$500");
        accounts.add(account1);
        // #2
        ExpandListItem account2 = new ExpandListItem("Savings", 11166112 + "-" + 24334, "$600");
        accounts.add(account2);
        // #3
        ExpandListItem account3 = new ExpandListItem("Investment", 11144112 + "-" + 98441, "$1500");
        accounts.add(account3);

        ExpandListItem totalDeposit = new ExpandListItem("TOTAL CAD $ ACCOUNTS", "", "$2600");
        accounts.add(totalDeposit);

        ExpandListItem credits = new ExpandListItem("Credit Accounts", "", "2 ACCOUNTS");
        accounts.add(credits);
        // #4
        ExpandListItem credit = new ExpandListItem("Credit", 1188222 + "-" + 23244, "$1500");
        accounts.add(credit);
        // #4
        ExpandListItem mortgage = new ExpandListItem("Mortgage", 177122 + "-" + 43341, "$112000");
        accounts.add(mortgage);

        ExpandListItem totalCredit = new ExpandListItem("TOTAL CAD $ ACCOUNTS", "", "$114600");
        accounts.add(totalCredit);
    }*/

}
