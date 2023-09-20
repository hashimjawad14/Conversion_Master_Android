package com.example.conversion_master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Friendship_Calculator4 extends AppCompatActivity {

    int percentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendship_calculator4);

        TextView ptv = findViewById(R.id.percentage);

        Intent intent = getIntent();
        percentage = intent.getIntExtra("percent", 0);

        ptv.setText(String.valueOf(percentage)+"%");

    }
}