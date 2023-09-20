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

public class Area_Converter extends AppCompatActivity {

    ArrayList<String> units = new ArrayList<>();

    double result;

    String from;

    String to;

    double input_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_converter);


        Spinner from_select = findViewById(R.id.from_select);
        Spinner to_select = findViewById(R.id.to_select);
        EditText value_input = findViewById(R.id.value_input);
        TextView result_tv = findViewById(R.id.result_tv);
        Button convert_btn = findViewById(R.id.convert_btn);

        units.add("Square Metres (m2)");
        units.add("Square Centimetres (cm2)");
        units.add("Square Kilometres (km2)");
        units.add("Square Feet (ft2)");

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


                if(from.equals("Square Metres (m2)" ) && to.equals("Square Kilometres (km2)"))
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

                if(from.equals("Square Metres (m2)" ) && to.equals("Square Centimetres (cm2)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*10000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Square Metres (m2)" ) && to.equals("Square Metres (m2)"))
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

                if(from.equals("Square Metres (m2)" ) && to.equals("Square Feet (ft2)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*10.7639;
                    result_tv.setText(String.valueOf(result));
                }





                if(from.equals("Square Kilometres (km2)" ) && to.equals("Square Kilometres (km2)"))
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

                if(from.equals("Square Kilometres (km2)" ) && to.equals("Square Centimetres (cm2)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*100000*100000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Square Kilometres (km2)" ) && to.equals("Square Metres (m2)"))
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

                if(from.equals("Square Kilometres (km2)" ) && to.equals("Square Feet (ft2)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*10760000;
                    result_tv.setText(String.valueOf(result));
                }




                if(from.equals("Square Centimetres (cm2)" ) && to.equals("Square Kilometres (km2)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0000000001;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Square Centimetres (cm2)" ) && to.equals("Square Centimetres (cm2)"))
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

                if(from.equals("Square Centimetres (cm2)" ) && to.equals("Square Metres (m2)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.0001;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Square Centimetres (cm2)" ) && to.equals("Square Feet (ft2)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.00107639;
                    result_tv.setText(String.valueOf(result));
                }






                if(from.equals("Square Feet (ft2)" ) && to.equals("Square Kilometres (km2)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value/10760000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Square Feet (ft2)" ) && to.equals("Square Centimetres (cm2)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*929.03;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Square Feet (ft2)" ) && to.equals("Square Metres (m2)"))
                {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch (NumberFormatException e){

                        e.printStackTrace();
                    }

                    result = input_value*0.092903;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Square Feet (ft2)" ) && to.equals("Square Feet (ft2)"))
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
            getWindow().setStatusBarColor(getResources().getColor(R.color.area_theme, this.getTheme()));
        }
    }
}