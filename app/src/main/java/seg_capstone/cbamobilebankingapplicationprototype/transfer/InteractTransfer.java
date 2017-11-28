package seg_capstone.cbamobilebankingapplicationprototype.transfer;

import android.widget.ImageView;

/**
 * Created by mohamadou on 2017-11-27.
 */

public class InteractTransfer {
    private int imageId;
    private String status;
    private String receiver;
    private String email;
    private String amount;
    private String date;

    public InteractTransfer() {}

    public InteractTransfer(int imageId, String status, String receiver, String email, String amount, String date) {
        this.imageId = imageId;
        this.status = status;
        this.receiver = receiver;
        this.email = email;
        this.amount = amount;
        this.date = date;
    }

    public int getEnvolope() {
        return imageId;
    }

    public void setEnvolope(int envolope) {
        this.imageId = envolope;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}
