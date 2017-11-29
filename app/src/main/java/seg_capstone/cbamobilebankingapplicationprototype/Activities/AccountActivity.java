package seg_capstone.cbamobilebankingapplicationprototype.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import seg_capstone.cbamobilebankingapplicationprototype.R;
import seg_capstone.cbamobilebankingapplicationprototype.account.Account;
import seg_capstone.cbamobilebankingapplicationprototype.adapters.AccountAdapter;
import seg_capstone.cbamobilebankingapplicationprototype.dataProvider.AccountProvider;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        ListView listView = (ListView) findViewById(R.id.content);
        AccountProvider AccountProvider = new AccountProvider();
        AccountProvider.feedData();
        ArrayList<Account> accounts = AccountProvider.getAccounts();
        //AccountAdapter accountAdapter = new AccountAdapter(this, accounts);
        AccountAdapter accountAdapter = new AccountAdapter(this, accounts);
        listView.setAdapter(accountAdapter);
    }
}
