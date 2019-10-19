package com.hackcbs.ocreclipse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

import androidx.recyclerview.widget.RecyclerView;

public class InvoicesAdapter extends RecyclerView.Adapter<InvoicesAdapter.MyViewHolder> {

    public ArrayList<Map<String, Object>> mDataset;
    private static final String DATE_FORMAT = "dd/MM/yyy";
    private Context mContext;
    private SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.getDefault());


    public InvoicesAdapter(Context context, ArrayList<Map<String, Object>> myDataset) {
        mContext = context;
        mDataset = myDataset;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        Map<String, Object> time = mDataset.get(position);
        holder.mInvoiceTitle.setText("NB0046b.jpg");
        holder.mInvoiceTime.setText("12:57 PM 19 Sep 2019");
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.invoice_row, parent, false);

        return new InvoicesAdapter.MyViewHolder(v);
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mInvoiceTitle, mInvoiceTime;

        public MyViewHolder(View v) {
            super(v);
            mInvoiceTitle = v.findViewById(R.id.txt_invoice_title);
            mInvoiceTime = v.findViewById(R.id.txt_invoice_time);
        }
    }


    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
