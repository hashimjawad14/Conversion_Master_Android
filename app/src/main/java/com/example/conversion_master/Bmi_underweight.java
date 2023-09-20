package com.example.conversion_master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Bmi_underweight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_underweight);


        TextView bmi_tv = findViewById(R.id.bmi_tv);

        Intent bmi_intent = getIntent();

        double bmi_value = bmi_intent.getDoubleExtra("BMI", 0);

        bmi_tv.setText(String.valueOf(bmi_value).substring(0,5));

    }
}