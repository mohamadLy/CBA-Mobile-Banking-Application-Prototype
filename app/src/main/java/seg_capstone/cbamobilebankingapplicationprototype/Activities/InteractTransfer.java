package seg_capstone.cbamobilebankingapplicationprototype.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TabHost;

import seg_capstone.cbamobilebankingapplicationprototype.R;
import seg_capstone.cbamobilebankingapplicationprototype.adapters.InteractTransferAdapter;
import seg_capstone.cbamobilebankingapplicationprototype.dataProvider.InteractProvider;

public class InteractTransfer extends AppCompatActivity {

    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interact_transfer);

        TabHost host = (TabHost)findViewById(R.id.tab_host);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab send");
        spec.setContent(R.id.tab1);
        spec.setIndicator("SEND");
        ListView listView = (ListView) findViewById(R.id.lv_interact);
        InteractProvider provider = new InteractProvider();
        provider.feed();
        InteractTransferAdapter adapter = new InteractTransferAdapter(this, provider.getTransfers());
        listView.setAdapter(adapter);
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Tab status");
        spec.setContent(R.id.tab2);
        spec.setIndicator("STATUS");
        host.addTab(spec);

    }

}
