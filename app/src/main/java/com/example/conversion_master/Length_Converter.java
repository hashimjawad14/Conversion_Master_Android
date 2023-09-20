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

public class Length_Converter extends AppCompatActivity {

    ArrayList<String> units = new ArrayList<>();

    double result;

    String from;

    String to;

    double input_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_converter);

        Spinner from_select = findViewById(R.id.from_select);
        Spinner to_select = findViewById(R.id.to_select);
        EditText value_input = findViewById(R.id.value_input);
        TextView result_tv = findViewById(R.id.result_tv);
        Button convert_btn = findViewById(R.id.convert_btn);

        units.add("Kilometer (km)");
        units.add("Meter (m)");
        units.add("Centimeter (cm)");
        units.add("Mile");
        units.add("Millimeter (mm)");
        units.add("Yard (yd)");
        units.add("Inches (in)");
        units.add("Feet (ft)");

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

                if(from.equals("Kilometer (km)") && to.equals("Meter (m)"))
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

                if(from.equals("Kilometer (km)") && to.equals("Centimeter (cm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*100000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Kilometer (km)") && to.equals("Mile"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.621371;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Kilometer (km)") && to.equals("Millimeter (mm)"))
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

                if(from.equals("Kilometer (km)") && to.equals("Yard (yd)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1093.61;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Kilometer (km)") && to.equals("Inches (in)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*39370.1;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Kilometer (km)") && to.equals("Feet (ft)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*3280.84;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Kilometer (km)") && to.equals("Kilometer (km)"))
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


                if(from.equals("Meter (m)") && to.equals("Meter (m)"))
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

                if(from.equals("Meter (m)") && to.equals("Centimeter (cm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*100;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Meter (m)") && to.equals("Mile"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.000621371;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Meter (m)") && to.equals("Millimeter (mm)"))
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

                if(from.equals("Meter (m)") && to.equals("Yard (yd)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1.09361;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Meter (m)") && to.equals("Inches (in)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*39.3701;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Meter (m)") && to.equals("Feet (ft)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*3.28084;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Meter (m)") && to.equals("Kilometer (km)"))
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


                if(from.equals("Centimeter (cm)") && to.equals("Meter (m)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.01;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Centimeter (cm)") && to.equals("Centimeter (cm)"))
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

                if(from.equals("Centimeter (cm)") && to.equals("Mile"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.00000621371;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Centimeter (cm)") && to.equals("Millimeter (mm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*10;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Centimeter (cm)") && to.equals("Yard (yd)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0109361;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Centimeter (cm)") && to.equals("Inches (in)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.393701;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Centimeter (cm)") && to.equals("Feet (ft)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0328084;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Centimeter (cm)") && to.equals("Kilometer (km)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.00001;
                    result_tv.setText(String.valueOf(result));
                }



                if(from.equals("Mile") && to.equals("Meter (m)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1609.34;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Mile") && to.equals("Centimeter (cm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*160934;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Mile") && to.equals("Mile"))
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

                if(from.equals("Mile") && to.equals("Millimeter (mm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1609000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Mile") && to.equals("Yard (yd)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1760;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Mile") && to.equals("Inches (in)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*63360;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Mile") && to.equals("Feet (ft)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*5280;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Mile") && to.equals("Kilometer (km)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*1.60934;
                    result_tv.setText(String.valueOf(result));
                }






                if(from.equals("Millimeter (mm)") && to.equals("Meter (m)"))
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

                if(from.equals("Millimeter (mm)") && to.equals("Centimeter (cm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.1;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Millimeter (mm)") && to.equals("Mile"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.000000621371;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Millimeter (mm)") && to.equals("Millimeter (mm)"))
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

                if(from.equals("Millimeter (mm)") && to.equals("Yard (yd)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.00109361;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Millimeter (mm)") && to.equals("Inches (in)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0393701;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Millimeter (mm)") && to.equals("Feet (ft)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.00328084;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Millimeter (mm)") && to.equals("Kilometer (km)"))
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






                if(from.equals("Yard (yd)") && to.equals("Meter (m)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.9144;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Yard (yd)") && to.equals("Centimeter (cm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*91.44;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Yard (yd)") && to.equals("Mile"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.000568182;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Yard (yd)") && to.equals("Millimeter (mm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*914.4;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Yard (yd)") && to.equals("Yard (yd)"))
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

                if(from.equals("Yard (yd)") && to.equals("Inches (in)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*36;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Yard (yd)") && to.equals("Feet (ft)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*3;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Yard (yd)") && to.equals("Kilometer (km)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0009144;
                    result_tv.setText(String.valueOf(result));
                }








                if(from.equals("Inches (in)") && to.equals("Meter (m)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0254;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Inches (in)") && to.equals("Centimeter (cm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*2.54;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Inches (in)") && to.equals("Mile"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0000157828;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Inches (in)") && to.equals("Millimeter (mm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*25.4;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Inches (in)") && to.equals("Yard (yd)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0277778;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Inches (in)") && to.equals("Inches (in)"))
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

                if(from.equals("Inches (in)") && to.equals("Feet (ft)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0833333;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Inches (in)") && to.equals("Kilometer (km)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0000254;
                    result_tv.setText(String.valueOf(result));
                }







                if(from.equals("Feet (ft)") && to.equals("Meter (m)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.3048;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Feet (ft)") && to.equals("Centimeter (cm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*30.48;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Feet (ft)") && to.equals("Mile"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.000189394;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Feet (ft)") && to.equals("Millimeter (mm)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*304.8;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Feet (ft)") && to.equals("Yard (yd)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.333333;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Feet (ft)") && to.equals("Inches (in)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*12;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Feet (ft)") && to.equals("Feet (ft)"))
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

                if(from.equals("Feet (ft)") && to.equals("Kilometer (km)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0000254;
                    result_tv.setText(String.valueOf(result));
                }

            }
        });

    statusbarColour();

    }

    private void statusbarColour(){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            getWindow().setStatusBarColor(getResources().getColor(R.color.length_theme, this.getTheme()));
        }
    }
}