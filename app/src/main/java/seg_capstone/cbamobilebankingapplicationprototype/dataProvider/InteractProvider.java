package seg_capstone.cbamobilebankingapplicationprototype.dataProvider;

import android.content.Context;

import java.util.ArrayList;

import seg_capstone.cbamobilebankingapplicationprototype.R;
import seg_capstone.cbamobilebankingapplicationprototype.transfer.InteractTransfer;

/**
 * Created by mohamadou on 2017-11-27.
 */

public class InteractProvider {
    ArrayList<InteractTransfer> transfers;
    Context context;

    public InteractProvider() {
        transfers = new ArrayList<>();
    }

    public void feed() {
        // #1
        int imageID = R.drawable.mail_icon;
        String receiver = "Joe";
        String email = "joe@gmail.com";
        String status = "send";
        String amount = "$500";
        String date = "Nov 27, 2017";
        InteractTransfer transfer = new InteractTransfer(imageID, status, receiver, email, amount, date);
        transfers.add(transfer);

        // #2
        int imageID2 = R.drawable.mail_icon;
        String receiver2 = "Maurice";
        String email2 = "maurice@gmail.com";
        String status2 = "send";
        String amount2 = "$350";
        InteractTransfer transfer2 = new InteractTransfer(imageID2, status2, receiver2, email2, amount2, "");
        transfers.add(transfer2);

        // #3
        int imageID3 = R.drawable.completed_green;
        String receiver3 = "Maurice";
        String email3 = "maurice@gmail.com";
        String status3 = "completed";
        String amount3 = "$350";
        String date3 = "Nov 27, 2017";
        InteractTransfer transfer3 = new InteractTransfer(imageID3, status3, receiver3, email3, amount3, date3);
        transfers.add(transfer3);

        // #3
        int imageID4 = R.drawable.completed_green;
        String receiver4 = "Paul";
        String email4 = "paull@gmail.com";
        String status4 = "completed";
        String amount4 = "$250";
        String date4 = "Nov 28, 2017";
        InteractTransfer transfer4 = new InteractTransfer(imageID4, status4, receiver4, email4, amount4, date4);
        transfers.add(transfer4);

        // #3
        int imageID5 = R.drawable.completed_green;
        String receiver5 = "max";
        String email5 = "max@gmail.com";
        String status5 = "completed";
        String amount5 = "$350";
        InteractTransfer transfer5 = new InteractTransfer(imageID5, status5, receiver5, email5, amount5, "");
        transfers.add(transfer5);
    }

    public ArrayList<InteractTransfer> getTransfers() {
        return transfers;
    }
}
