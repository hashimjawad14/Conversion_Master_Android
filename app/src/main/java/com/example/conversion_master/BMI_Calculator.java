package com.example.conversion_master;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class BMI_Calculator extends AppCompatActivity {

    double height;

    String gender;

    double height_value;

    double weight_value;

    double bmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);

        CardView male = findViewById(R.id.male);
        CardView female = findViewById(R.id.female);
        RadioGroup height_select = findViewById(R.id.height_select);
        RadioGroup weight_select = findViewById(R.id.weight_select);
        Button convert_btn = findViewById(R.id.convert_btn);
        EditText height_input = findViewById(R.id.height_input);
        EditText weight_input = findViewById(R.id.weight_input);



        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                male.setFocusableInTouchMode(true);
                male.setBackground(getApplicationContext().getDrawable(R.drawable.bg_cardview));
                female.setBackground(getApplicationContext().getDrawable(R.color.white));
                gender = "male";
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                female.setFocusableInTouchMode(true);
                female.setBackground(getApplicationContext().getDrawable(R.drawable.bg_cardview));
                male.setBackground(getApplicationContext().getDrawable(R.color.white));
                gender = "female";
            }
        });



        convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((height_select.getCheckedRadioButtonId() == R.id.height_btn1) && (weight_select.getCheckedRadioButtonId() == R.id.weight_btn1))
                {
                    height_value = Double.parseDouble(height_input.getText().toString());
                    height_value = (height_value * 0.3048) * (height_value * 0.3048);

                    weight_value = Double.parseDouble(weight_input.getText().toString());

                    bmi = weight_value / height_value;

                    if (bmi <= 18.5)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_underweight.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                    if (bmi > 18.5 && bmi <=25)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_normal.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                    if (bmi > 25)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_overweight.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                }



                if ((height_select.getCheckedRadioButtonId() == R.id.height_btn2) && (weight_select.getCheckedRadioButtonId() == R.id.weight_btn1))
                {
                    height_value = Double.parseDouble(height_input.getText().toString());
                    height_value = (height_value / 100) * (height_value / 100);

                    weight_value = Double.parseDouble(weight_input.getText().toString());

                    bmi = weight_value / height_value;

                    if (bmi <= 18.5)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_underweight.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                    if (bmi > 18.5 && bmi <=25)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_normal.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                    if (bmi > 25)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_overweight.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                }




                if ((height_select.getCheckedRadioButtonId() == R.id.height_btn1) && (weight_select.getCheckedRadioButtonId() == R.id.weight_btn2))
                {
                    height_value = Double.parseDouble(height_input.getText().toString());
                    height_value = (height_value * 0.3048) * (height_value * 0.3048);

                    weight_value = Double.parseDouble(weight_input.getText().toString());
                    weight_value = weight_value * 0.453592;

                    bmi = weight_value / height_value;

                    if (bmi <= 18.5)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_underweight.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                    if (bmi > 18.5 && bmi <=25)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_normal.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                    if (bmi > 25)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_overweight.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                }





                if ((height_select.getCheckedRadioButtonId() == R.id.height_btn2) && (weight_select.getCheckedRadioButtonId() == R.id.weight_btn2))
                {
                    height_value = Double.parseDouble(height_input.getText().toString());
                    height_value = (height_value / 100) * (height_value / 100);

                    weight_value = Double.parseDouble(weight_input.getText().toString());
                    weight_value = weight_value * 0.453592;

                    bmi = weight_value / height_value;

                    if (bmi <= 18.5)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_underweight.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                    if (bmi > 18.5 && bmi <=25)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_normal.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                    if (bmi > 25)
                    {
                        Intent bmi_intent = new Intent(BMI_Calculator.this, Bmi_overweight.class);
                        bmi_intent.putExtra("BMI", bmi);
                        startActivity(bmi_intent);
                    }

                }

            }
        });








    }
}