package seg_capstone.cbamobilebankingapplicationprototype.DataProviders;

import java.util.ArrayList;

import seg_capstone.cbamobilebankingapplicationprototype.bills.Bill;

/**
 * Created by mohamadou on 2017-11-26.
 */

public class BillsProvider {
    ArrayList<Bill> bills;

    public BillsProvider() {
        bills = new ArrayList<>();
    }

    public void feedData() {
        // #1
        Bill bill = new Bill("Payee", "ELECTRICITY", "$75.00", "Nov 22, 2017", " 111111111");
        bills.add(bill);

        // #2
        Bill bill2 = new Bill("Payee", "ELECTRICITY", "$75.00", "Nov 22, 2017", " 111111111");
        bills.add(bill2);
    }
    public void test() {}
}
