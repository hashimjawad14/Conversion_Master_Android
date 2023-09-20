package com.example.conversion_master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Friendship_Calculator2 extends AppCompatActivity {

    String name1;
    String name2;

    int percentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendship_calculator2);

        EditText name = findViewById(R.id.name);
        EditText friend = findViewById(R.id.friend_name);
        Button calc_btn = findViewById(R.id.calc_btn);



        calc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name1 = name.getText().toString();
                name2 = friend.getText().toString();


                percentage = calculateFriendshipPercentage(name1, name2);

                if(percentage>=70)
                {
                    Intent intent = new Intent(Friendship_Calculator2.this, Friendship_Calculator5.class);
                    intent.putExtra("percent", percentage);
                    startActivity(intent);
                }

                if(percentage>=50 && percentage<75)
                {
                    Intent intent = new Intent(Friendship_Calculator2.this, Friendship_Calculator4.class);
                    intent.putExtra("percent", percentage);
                    startActivity(intent);
                }

                if(percentage<50)
                {
                    Intent intent = new Intent(Friendship_Calculator2.this, Friendship_Calculator3.class);
                    intent.putExtra("percent", percentage);
                    startActivity(intent);
                }


            }
        });



    }

    private int calculateFriendshipPercentage(String person1, String person2) {
        // Convert names to lowercase for case-insensitive comparison
        person1 = person1.toLowerCase();
        person2 = person2.toLowerCase();

        int no_char1 = person1.length();
        int no_char2 = person2.length();

        // Calculate the percentage based on the matching characters
        if(no_char1 < no_char2) {
            int percentage = ((no_char1 * 100) / no_char2) % 100;
            return (int) percentage;
        }
        else if(no_char1 == no_char2) {
            int percentage = ((no_char1 * 100) / no_char2);
            return (int) percentage;
        }
        else{
            int percentage = ((no_char2 * 100) / no_char1) % 100;
            return (int) percentage;
        }

    }





}