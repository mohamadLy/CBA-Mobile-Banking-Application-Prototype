package seg_capstone.cbamobilebankingapplicationprototype.Adapters;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import seg_capstone.cbamobilebankingapplicationprototype.Classes.ExpandListGroup;
import seg_capstone.cbamobilebankingapplicationprototype.Classes.ExpandListItem;
import seg_capstone.cbamobilebankingapplicationprototype.R;

public class ExpandListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private ArrayList<ExpandListGroup> groups;

    public ExpandListAdapter(Context context, ArrayList<ExpandListGroup> groups) {
        this.context = context;
        this.groups = groups;
    }

    public void addItem(ExpandListItem item, ExpandListGroup group) {
        if (!groups.contains(group)){
            groups.add(group);
        }
        int groupIndex = groups.indexOf(group);
        ArrayList<ExpandListItem> groupItems = groups.get(groupIndex).getItems();
        groupItems.add(item);
        groups.get(groupIndex).setItems(groupItems);
    }

    public Object getChild(int groupPosition, int childPosition) {
        ArrayList<ExpandListItem> chList = groups.get(groupPosition).getItems();
        return chList.get(childPosition);
    }

    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    public View getChildView(int groupPosition, int itemPosition, boolean isLastItem, View view,
                             ViewGroup parent) {

        ExpandListItem item = (ExpandListItem) getChild(groupPosition, itemPosition);

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.expand_list_item, null);
        }

        TextView itemName = (TextView) view.findViewById(R.id.itemName);
        TextView itemDetails = (TextView) view.findViewById(R.id.itemDetails);
        TextView itemValue = (TextView) view.findViewById(R.id.itemValue);

        itemName.setText(item.getName().toString());
        itemDetails.setText(item.getDetails().toString());
        if (item.getValue().toString().contains("-")){
            itemValue.setText(item.getValue().toString());
            itemValue.setTextColor(ContextCompat.getColor(context,R.color.negativeTransactionColor));
        } else {
            itemValue.setText(item.getValue().toString());
            itemValue.setTextColor(ContextCompat.getColor(context,R.color.positiveTransactionColor));
        }


        return view;
    }

    public int getChildrenCount(int groupPosition) {
        ArrayList<ExpandListItem> itemList = groups.get(groupPosition).getItems();
        return itemList.size();
    }

    public Object getGroup(int groupPosition) {
        return groups.get(groupPosition);
    }

    public int getGroupCount() {
        return groups.size();
    }

    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    public View getGroupView(int groupPosition, boolean isLastChild, View view,
                             ViewGroup parent) {

        ExpandListGroup group = (ExpandListGroup) getGroup(groupPosition);

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.expand_list_group, null);
        }

        TextView groupName = (TextView) view.findViewById(R.id.groupName);
        groupName.setText(group.getName());
        return view;
    }

    public boolean hasStableIds() {
        return true;
        }

    public boolean isChildSelectable(int arg0, int arg1) {
        return true;
    }
}
