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
        int imageID = R.drawable.ic_mail_outline_black_24dp;
        String receiver = "Joe";
        String email = "joe@gmail.com";
        String status = "send";
        String amount = "$500";
        InteractTransfer transfer = new InteractTransfer(imageID, status, receiver, email, amount);
        transfers.add(transfer);

        // #2
        int imageID2 = R.drawable.ic_mail_outline_black_24dp;
        String receiver2 = "Maurice";
        String email2 = "maurice@gmail.com";
        String status2 = "send";
        String amount2 = "$350";
        InteractTransfer transfer2 = new InteractTransfer(imageID2, status2, receiver2, email2, amount2);
        transfers.add(transfer2);

        // #3
        int imageID3 = R.drawable.ic_mail_outline_black_24dp;
        String receiver3 = "Maurice";
        String email3 = "maurice@gmail.com";
        String status3 = "send";
        String amount3 = "$350";
        InteractTransfer transfer3 = new InteractTransfer(imageID3, status3, receiver3, email3, amount3);
        transfers.add(transfer3);
    }

    public ArrayList<InteractTransfer> getTransfers() {
        return transfers;
    }
}
