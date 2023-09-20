package com.example.conversion_master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Volume_Converter extends AppCompatActivity {


    ArrayList<String> units = new ArrayList<>();

    double result;

    String from;

    String to;

    double input_value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_converter);


        Spinner from_select = findViewById(R.id.from_select);
        Spinner to_select = findViewById(R.id.to_select);
        EditText value_input = findViewById(R.id.value_input);
        TextView result_tv = findViewById(R.id.result_tv);
        Button convert_btn = findViewById(R.id.convert_btn);

        units.add("Liter (l)");
        units.add("Milliliter/cm3");
        units.add("Gallon");
        units.add("Pint");
        units.add("Cubic meter (m3)");

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

                if(from.equals("Liter (l)" ) && to.equals("Milliliter/cm3"))
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


                if(from.equals("Liter (l)" ) && to.equals("Gallon"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.264172;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Liter (l)" ) && to.equals("Pint"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*2.11338;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Liter (l)" ) && to.equals("Liter (l)"))
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

                if(from.equals("Liter (l)" ) && to.equals("Cubic meter (m3)"))
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





                if(from.equals("Milliliter/cm3" ) && to.equals("Milliliter/cm3"))
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


                if(from.equals("Milliliter/cm3" ) && to.equals("Gallon"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.000264172;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Milliliter/cm3" ) && to.equals("Pint"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.00211338;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Milliliter/cm3" ) && to.equals("Liter (l)"))
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

                if(from.equals("Milliliter/cm3" ) && to.equals("Cubic meter (m3)"))
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




                if(from.equals("Gallon" ) && to.equals("Milliliter/cm3"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*3785.41;
                    result_tv.setText(String.valueOf(result));
                }


                if(from.equals("Gallon" ) && to.equals("Gallon"))
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

                if(from.equals("Gallon" ) && to.equals("Pint"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*8;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Gallon" ) && to.equals("Liter (l)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*3.78541;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Gallon" ) && to.equals("Cubic meter (m3)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.00378541;
                    result_tv.setText(String.valueOf(result));
                }






                if(from.equals("Pint" ) && to.equals("Milliliter/cm3"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*473.176;
                    result_tv.setText(String.valueOf(result));
                }


                if(from.equals("Pint" ) && to.equals("Gallon"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.125;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Pint" ) && to.equals("Pint"))
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

                if(from.equals("Pint" ) && to.equals("Liter (l)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.473176;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Pint" ) && to.equals("Cubic meter (m3)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.000473176;
                    result_tv.setText(String.valueOf(result));
                }




                if(from.equals("Cubic meter (m3)" ) && to.equals("Milliliter/cm3"))
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


                if(from.equals("Cubic meter (m3)" ) && to.equals("Gallon"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*264.172;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Cubic meter (m3)" ) && to.equals("Pint"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*2113.38;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Cubic meter (m3)" ) && to.equals("Liter (l)"))
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

                if(from.equals("Cubic meter (m3)" ) && to.equals("Cubic meter (m3)"))
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
            getWindow().setStatusBarColor(getResources().getColor(R.color.volume_theme, this.getTheme()));
        }
    }
}