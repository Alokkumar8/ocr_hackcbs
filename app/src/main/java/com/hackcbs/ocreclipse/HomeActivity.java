package com.hackcbs.ocreclipse;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.leinardi.android.speeddial.SpeedDialActionItem;
import com.leinardi.android.speeddial.SpeedDialView;

public class HomeActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = findViewById(R.id.tbHome);

        setSupportActionBar(toolbar);
        ActionBar actionbar;
        actionbar = getSupportActionBar();
        assert actionbar != null;
        actionbar.setTitle("OCR HackCBS");

        SpeedDialView speedDialView = findViewById(R.id.fabAddInvoice);

        speedDialView.inflate(R.menu.menu_speed_dial);

        speedDialView.setOnActionSelectedListener(new SpeedDialView.OnActionSelectedListener() {
            @Override
            public boolean onActionSelected(SpeedDialActionItem actionItem) {
                if (actionItem.getId() == R.id.menu_camera) {
                    Intent intent = new Intent(HomeActivity.this, TakePhotoActivity.class);
                    startActivity(intent);
                    return true;
                } else if (actionItem.getId() == R.id.menu_gallery) {
                    return true;
                }
                return false;
            }
        });

    }
}
