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

public class Weight_Converter extends AppCompatActivity {

    ArrayList<String> units = new ArrayList<>();

    double result;

    String from;

    String to;

    double input_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_converter);

        Spinner from_select = findViewById(R.id.from_select);
        Spinner to_select = findViewById(R.id.to_select);
        EditText value_input = findViewById(R.id.value_input);
        TextView result_tv = findViewById(R.id.result_tv);
        Button convert_btn = findViewById(R.id.convert_btn);

        units.add("Kilogram (kg)");
        units.add("Gram (g)");
        units.add("Pound (lb)");
        units.add("Tonne (t)");
        units.add("Ounce (oz)");
        units.add("Milligram (mg)");

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

                if(from.equals("Kilogram (kg)") && to.equals("Gram (g)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Kilogram (kg)") && to.equals("Pound (lb)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*2.20462;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Kilogram (kg)") && to.equals("Tonne (t)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value/1000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Kilogram (kg)") && to.equals("Ounce (oz)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*35.274;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Kilogram (kg)") && to.equals("Milligram (mg)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1000000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Kilogram (kg)") && to.equals("Kilogram (kg)"))
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

                if(from.equals("Gram (g)") && to.equals("Milligram (mg)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Gram (g)") && to.equals("Kilogram (kg)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value/1000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Gram (g)") && to.equals("Tonne (t)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value/1000000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Gram (g)") && to.equals("Pound (lb)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.00220462;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Gram (g)") && to.equals("Ounce (oz)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.035274;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Gram (g)") && to.equals("Gram (g)"))
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

                if(from.equals("Pound (lb)") && to.equals("Kilogram (kg)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.453592;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Pound (lb)") && to.equals("Pound (lb)"))
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

                if(from.equals("Pound (lb)") && to.equals("Milligram (mg)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*453592;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Pound (lb)") && to.equals("Gram (g)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*453.592;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Pound (lb)") && to.equals("Tonne (t)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.000453592;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Pound (lb)") && to.equals("Ounce (oz)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*16;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Tonne (t)") && to.equals("Tonne (t)"))
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

                if(from.equals("Tonne (t)") && to.equals("Kilogram (kg)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Tonne (t)") && to.equals("Milligram (mg)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1000000000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Tonne (t)") && to.equals("Gram (g)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1000000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Tonne (t)") && to.equals("Pound (lb)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*2204.62;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Tonne (t)") && to.equals("Ounce (oz)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*35274;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Ounce (oz)") && to.equals("Ounce (oz)"))
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

                if(from.equals("Ounce (oz)") && to.equals("Kilogram (kg)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0283495;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Ounce (oz)") && to.equals("Milligram (mg)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*28349.5;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Ounce (oz)") && to.equals("Gram (g)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*28.3495;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Ounce (oz)") && to.equals("Tonne (t)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0000283495;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Ounce (oz)") && to.equals("Pound (lb)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0625;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Milligram (mg)") && to.equals("Pound (lb)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.00000220462;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Milligram (mg)") && to.equals("Kilogram (kg)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.000001;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Milligram (mg)") && to.equals("Milligram (g)"))
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

                if(from.equals("Milligram (mg)") && to.equals("Gram (g)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.001;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Milligram (mg)") && to.equals("Tonne (t)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.000000001;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Milligram (mg)") && to.equals("Ounce (oz)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.000035274;
                    result_tv.setText(String.valueOf(result));
                }


            }
        });

    statusbarColour();

    }

    private void statusbarColour(){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            getWindow().setStatusBarColor(getResources().getColor(R.color.weight_theme, this.getTheme()));
        }
    }
}