package com.example.msi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Til Tanlash Tugmasini Bosing",Toast.LENGTH_LONG).show();

    }

    public void kirilAlifbosi(View view) {
        Intent intent = new Intent(this,KirilActivity.class);
        startActivity(intent);

      //  button = ((Button) view);
       // button.setEnabled(false);
    }

    public void lotinAlifbosi(View view) {
        Intent intent = new Intent(this,LotinActivity.class);
        startActivity(intent);

    //    button = ((Button) view);
       // button.setEnabled(false);
    }

    public void openReminder(View view) {
        Intent intent = new Intent(this,Reminder.class);
        startActivity(intent);
    }
}