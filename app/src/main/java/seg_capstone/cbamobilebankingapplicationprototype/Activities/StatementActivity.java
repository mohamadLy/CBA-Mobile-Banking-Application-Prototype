package seg_capstone.cbamobilebankingapplicationprototype.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;

import seg_capstone.cbamobilebankingapplicationprototype.Adapters.ExpandListAdapter;
import seg_capstone.cbamobilebankingapplicationprototype.Classes.ExpandListGroup;
import seg_capstone.cbamobilebankingapplicationprototype.DataProviders.DataProvider;
import seg_capstone.cbamobilebankingapplicationprototype.R;

public class StatementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statement);

        ExpandableListView mainScreenList = (ExpandableListView) findViewById(R.id.mainScreenList);
        ArrayList<ExpandListGroup> groups = DataProvider.getTransactionroups();
        ExpandListAdapter expandListAdapter = new ExpandListAdapter(this, groups);
        mainScreenList.setAdapter(expandListAdapter);

    }
}
