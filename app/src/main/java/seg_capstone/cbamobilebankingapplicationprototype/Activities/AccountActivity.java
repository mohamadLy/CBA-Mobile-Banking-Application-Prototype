package seg_capstone.cbamobilebankingapplicationprototype.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;

import seg_capstone.cbamobilebankingapplicationprototype.Adapters.ExpandListAdapter;
import seg_capstone.cbamobilebankingapplicationprototype.Classes.ExpandListGroup;
import seg_capstone.cbamobilebankingapplicationprototype.DataProviders.DataProvider;
import seg_capstone.cbamobilebankingapplicationprototype.R;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        ExpandableListView mainScreenList = (ExpandableListView) findViewById(R.id.mainScreenList);
        ArrayList<ExpandListGroup> groups = DataProvider.getAccountGroups();
        ExpandListAdapter expandListAdapter = new ExpandListAdapter(this, groups);
        mainScreenList.setAdapter(expandListAdapter);
        mainScreenList.expandGroup(0);
    }
}
