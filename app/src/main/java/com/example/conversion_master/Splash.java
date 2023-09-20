package com.example.conversion_master;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logo = findViewById(R.id.logo);
        TextView title = findViewById(R.id.title1);

        Animation splash_animation = AnimationUtils.loadAnimation(this, R.anim.splash_animation);
        Animation text_animation = AnimationUtils.loadAnimation(this, R.anim.image_anim);

        logo.startAnimation(splash_animation);
        title.startAnimation(text_animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3500);
    }
}