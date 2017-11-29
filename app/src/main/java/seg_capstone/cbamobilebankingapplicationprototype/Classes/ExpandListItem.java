package seg_capstone.cbamobilebankingapplicationprototype.Classes;

/**
 * Created by mohamadou on 2017-11-23.
 */

public class ExpandListItem {
    private String name;
    private String details;
    private String value;

    // public ExpandListItem() {}

    public ExpandListItem(String name, String details, String value) {
        this.name = name;
        this.details = details;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
