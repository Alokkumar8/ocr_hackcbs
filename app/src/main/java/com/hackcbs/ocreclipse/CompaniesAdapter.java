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

public class CompaniesAdapter extends RecyclerView.Adapter<CompaniesAdapter.MyViewHolder> {

    public ArrayList<Map<String, Object>> mDataset;
    private static final String DATE_FORMAT = "dd/MM/yyy";
    private Context mContext;
    private SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.getDefault());


    public CompaniesAdapter(Context context, ArrayList<Map<String, Object>> myDataset) {
        mContext = context;
        mDataset = myDataset;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mCompanyTitle.setText("Computer Network");
        holder.mCompanyInvoiceNumber.setText("19 Invoices");
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.company_row, parent, false);

        return new CompaniesAdapter.MyViewHolder(v);
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView mCompanyTitle, mCompanyInvoiceNumber;
        public MyViewHolder(View v) {
            super(v);
            mCompanyTitle = v.findViewById(R.id.txt_company_title);
            mCompanyInvoiceNumber = v.findViewById(R.id.txt_company_invoice_number);
        }
    }


    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
