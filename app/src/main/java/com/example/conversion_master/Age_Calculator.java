package com.example.conversion_master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Age_Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_calculator);

        ImageView next = findViewById(R.id.next);
        ImageView img1 = findViewById(R.id.img1);
        ImageView img2 = findViewById(R.id.img2);
        ImageView img3 = findViewById(R.id.img3);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.image_anim);
        img1.startAnimation(animation);
        img2.startAnimation(animation);
        img3.startAnimation(animation);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Age_Calculator.this, Age_Calculator1.class);
                startActivity(intent);
            }
        });
    }
}