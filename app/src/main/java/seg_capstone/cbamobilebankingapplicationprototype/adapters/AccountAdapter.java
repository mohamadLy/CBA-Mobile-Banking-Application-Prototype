package seg_capstone.cbamobilebankingapplicationprototype.adapters;

import android.accounts.Account;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import seg_capstone.cbamobilebankingapplicationprototype.R;

/**
 * Created by mohamadou on 2017-11-23.
 */

public class AccountAdapter extends ArrayAdapter<Account> {
    // View lookup adapter
    private static class ViewHolder {
        TextView type;
        TextView account;
        TextView balance;
    }
    public AccountAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the data item for this position
        Account account = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder;
        if(convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new ViewHolder();
            LayoutInflater intentFilter = LayoutInflater.from(getContext());
            convertView = intentFilter.inflate(R.layout.account_item_list, parent, false);
            viewHolder.type = (TextView) convertView.findViewById(R.id.account_type);
            // Cache the viewHolder object inside the fresh view
        } else {

        }
        return convertView;
    }
}
