package seg_capstone.cbamobilebankingapplicationprototype.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TabHost;

import seg_capstone.cbamobilebankingapplicationprototype.R;
import seg_capstone.cbamobilebankingapplicationprototype.adapters.InteractTransferAdapter;
import seg_capstone.cbamobilebankingapplicationprototype.dataProvider.InteractProvider;

public class Bills extends AppCompatActivity {

    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bills);
        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();


        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab cancel");
        spec.setContent(R.id.next);
        spec.setIndicator("CANCEL");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Tab next");
        spec.setContent(R.id.cancelled);
        spec.setIndicator("NEXT");
        host.addTab(spec);

    }
}
