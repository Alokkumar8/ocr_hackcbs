package com.hackcbs.ocreclipse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InvoiceDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice_details);

        String string_details = getIntent().getStringExtra("details");
        TextView other_details = findViewById(R.id.tv_serial_number);

        other_details.setText(string_details);

    }
}
