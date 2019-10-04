package com.example.msi;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Reminder extends AppCompatActivity {

    private String order = "Yozish qoidalari bilan Tanishing";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        Toast.makeText(this,order.toUpperCase(),Toast.LENGTH_LONG).show();
    }
}
