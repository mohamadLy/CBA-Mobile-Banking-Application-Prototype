package seg_capstone.cbamobilebankingapplicationprototype.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import seg_capstone.cbamobilebankingapplicationprototype.R;
import seg_capstone.cbamobilebankingapplicationprototype.transfer.InteractTransfer;

/**
 * Created by mohamadou on 2017-11-27.
 */

public class InteractTransferAdapter extends ArrayAdapter<InteractTransfer> {
    // View lookup adapter
    private static class ViewHolder {
        ImageView envolope;
        TextView status;
        TextView receiver;
        TextView email;
        TextView amount;
        TextView date;
    }
    public InteractTransferAdapter(@NonNull Context context, ArrayList<InteractTransfer> transfers) {
        super(context, 0, transfers);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the data item for this position
        InteractTransfer transfer = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        InteractTransferAdapter.ViewHolder viewHolder;
        if(convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new InteractTransferAdapter.ViewHolder();
            LayoutInflater intentFilter = LayoutInflater.from(getContext());
            convertView = intentFilter.inflate(R.layout.interact_item_list, parent, false);
            viewHolder.status = (TextView) convertView.findViewById(R.id.status_type);
            viewHolder.email = (TextView) convertView.findViewById(R.id.email);
            viewHolder.receiver = (TextView) convertView.findViewById(R.id.destinataire_name);
            viewHolder.amount = (TextView) convertView.findViewById(R.id.money);
            viewHolder.envolope = (ImageView) convertView.findViewById(R.id.envolope);
            viewHolder.date = (TextView) convertView.findViewById(R.id.date_interact);
            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (InteractTransferAdapter.ViewHolder) convertView.getTag();
        }
        // Populate the data from the data object via the viewHolder object
        // into the template view.
        populateView(transfer, viewHolder, convertView);
        return convertView;
    }

    public void populateView(InteractTransfer transfer, InteractTransferAdapter.ViewHolder viewHolder, View context) {
        viewHolder.email.setText(transfer.getEmail());
        viewHolder.status.setText(transfer.getStatus());
        //viewHolder.envolope = (ImageView) context.findViewById(transfer.getEnvolope());
        viewHolder.envolope.setImageResource((transfer.getEnvolope()));
        viewHolder.amount.setText(transfer.getAmount());
        viewHolder.receiver.setText(transfer.getReceiver());
        viewHolder.date.setText(transfer.getDate());
    }
}
