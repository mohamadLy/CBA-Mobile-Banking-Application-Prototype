package seg_capstone.cbamobilebankingapplicationprototype.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import seg_capstone.cbamobilebankingapplicationprototype.R;
import seg_capstone.cbamobilebankingapplicationprototype.account.Account;

/**
 * Created by mohamadou on 2017-11-23.
 */

public class AccountAdapter extends ArrayAdapter<Account> {
    // View lookup adapter
    private static class ViewHolder {
        TextView type;
        TextView accountNumbber;
        TextView balance;
    }
    public AccountAdapter(@NonNull Context context, ArrayList<Account> accountArrayAdapter) {
        super(context, 0, accountArrayAdapter);
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
            viewHolder.accountNumbber = (TextView) convertView.findViewById(R.id.account_number);
            viewHolder.balance = (TextView) convertView.findViewById(R.id.account_balance);
            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data from the data object via the viewHolder object
        // into the template view.
        viewHolder.accountNumbber.setText(String.valueOf(account.getAccountNumber()));
        viewHolder.balance.setText(String.valueOf(account.getBalance()));
        viewHolder.type.setText(account.getType());
        return convertView;
    }
}
