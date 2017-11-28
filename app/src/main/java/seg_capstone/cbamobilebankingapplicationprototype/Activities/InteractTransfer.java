package seg_capstone.cbamobilebankingapplicationprototype.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import seg_capstone.cbamobilebankingapplicationprototype.R;

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
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Tab status");
        spec.setContent(R.id.tab2);
        spec.setIndicator("STATUS");
        host.addTab(spec);

    }

}
