package com.example.quickdeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mens_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens_activity);
    }

    public void mainPage(View view) {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}
