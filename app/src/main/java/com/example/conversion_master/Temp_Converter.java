package com.example.conversion_master;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Temp_Converter extends AppCompatActivity {

    ArrayList<String> units = new ArrayList<>();
    double result;

    String from;

    String to;

    double input_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);

        Spinner from_select = findViewById(R.id.from_select);
        Spinner to_select = findViewById(R.id.to_select);
        EditText value_input = findViewById(R.id.value_input);
        TextView result_tv = findViewById(R.id.result_tv);
        Button convert_btn = findViewById(R.id.convert_btn);


        units.add("Celsius (°C)");
        units.add("Fahrenheit (°F)");
        units.add("Kelvin (K)");




        ArrayAdapter<String> spinner_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, units);
        from_select.setAdapter(spinner_adapter);
        to_select.setAdapter(spinner_adapter);

        from_select.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.getItemAtPosition(position);
                from_select.setSelection(position);
                from = from_select.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        to_select.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.getItemAtPosition(position);
                to_select.setSelection(position);
                to = to_select.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });







        convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (from.equals("Celsius (°C)") && to.equals("Fahrenheit (°F)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                   result = (((9*input_value)/5)+32);
                   result_tv.setText(String.valueOf(result));
                }

                if (from.equals("Celsius (°C)") && to.equals("Kelvin (K)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = (input_value+273.15);
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("Celsius (°C)") && to.equals("Celsius (°C)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("Fahrenheit (°F)") && to.equals("Celsius (°C)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = (5*(input_value-32)/9);
                    result_tv.setText(String.valueOf(result));
                }


                if (from.equals("Fahrenheit (°F)") && to.equals("Kelvin (K)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = ((((input_value-32)*5)/9)+273.15);
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("Fahrenheit (°F)") && to.equals("Fahrenheit (°F)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("Kelvin (K)") && to.equals("Fahrenheit (°F)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = (((input_value-273.15)*9)/5)+32;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("Kelvin (K)") && to.equals("Celsius (°C)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value-273.15;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("Kelvin (K)") && to.equals("Kelvin (K)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

            }
        });

        statusbarColour();

    }

    private void statusbarColour(){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            getWindow().setStatusBarColor(getResources().getColor(R.color.temp_theme, this.getTheme()));
        }
    }
}