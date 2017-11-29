package seg_capstone.cbamobilebankingapplicationprototype.bills;

/**
 * Created by mohamadou on 2017-11-26.
 */

public class Bill {
    private String payeeText;
    private String electricity;
    private String billAmount;
    private String date;
    private String billId;

    public Bill() {}

    public Bill(String payeeText, String electricity, String billAmount, String date, String billId) {
        this.payeeText = payeeText;
        this.electricity = electricity;
        this.billAmount = billAmount;
        this.date = date;
        this.billId = billId;
    }

    public String getPayeeText() {
        return payeeText;
    }

    public void setPayeeText(String payeeText) {
        this.payeeText = payeeText;
    }

    public String getElectricity() {
        return electricity;
    }

    public void setElectricity(String electricity) {
        this.electricity = electricity;
    }

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }
}
