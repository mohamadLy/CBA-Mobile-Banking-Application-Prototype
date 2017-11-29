package seg_capstone.cbamobilebankingapplicationprototype.Classes;

import java.util.ArrayList;

public class ExpandListGroup {
    private String name;
    private ArrayList<ExpandListItem> items;

    public ExpandListGroup(String name, ArrayList<ExpandListItem> items){
        this.name = name;
        this.items = items;
    }

    public ExpandListGroup(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<ExpandListItem> getItems(){
        return items;
    }

    public void setItems(ArrayList<ExpandListItem> items) {
        this.items = items;
    }
}
