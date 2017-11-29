package seg_capstone.cbamobilebankingapplicationprototype.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TabHost;

import seg_capstone.cbamobilebankingapplicationprototype.R;
import seg_capstone.cbamobilebankingapplicationprototype.Adapters.InteractTransferAdapter;
import seg_capstone.cbamobilebankingapplicationprototype.DataProviders.InteractProvider;

public class InteractTransfer extends AppCompatActivity implements TabHost.OnTabChangeListener {

    TabHost tabHost;

    private static final String LIST1_TAB_TAG = "List1";
    private static final String LIST2_TAB_TAG = "List2";

    // The two views in our tabbed example
    private ListView listView1;
    private ListView listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interact_transfer);

        TabHost host = (TabHost)findViewById(R.id.tab_host);
        host.setup();

        ListView listView = (ListView) findViewById(R.id.lv_interact);

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab send");
        spec.setContent(R.id.tab1);
        spec.setIndicator("SEND");

        InteractProvider provider = new InteractProvider();
        provider.feedSent();
        InteractTransferAdapter adapter = new InteractTransferAdapter(this, provider.getTransfers());
        listView.setAdapter(adapter);
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Tab status");
        spec.setContent(R.id.tab2);
        spec.setIndicator("STATUS");

     //   provider.feedStatus();
       // adapter = new InteractTransferAdapter(this, provider.getTransfers());
        //listView2.setAdapter(adapter);
        host.addTab(spec);

    }

    @Override
    public void onTabChanged(String s) {

    }
}
