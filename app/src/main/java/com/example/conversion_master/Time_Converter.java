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

public class Time_Converter extends AppCompatActivity {

    ArrayList<String> units = new ArrayList<>();

    String from;

    String to;

    double input_value;

    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_converter);

        Spinner from_select = findViewById(R.id.from_select);
        Spinner to_select = findViewById(R.id.to_select);
        EditText value_input = findViewById(R.id.value_input);
        TextView result_tv = findViewById(R.id.result_tv);
        Button convert_btn = findViewById(R.id.convert_btn);

       units.add("Hour");
        units.add("Minute");
        units.add("Second");
        units.add("Millisecond");

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

                if(from.equals("Hour") && to.equals("Minute"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value*60;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Hour") && to.equals("Second"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value*3600;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Hour") && to.equals("Millisecond"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value*3600*1000;
                    result_tv.setText(String.valueOf(result));
                }



                if(from.equals("Hour") && to.equals("Hour"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }




                if(from.equals("Minute") && to.equals("Minute"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Minute") && to.equals("Second"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value*60;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Minute") && to.equals("Millisecond"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value*60*1000;
                    result_tv.setText(String.valueOf(result));
                }


                if(from.equals("Minute") && to.equals("Hour"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value/60;
                    result_tv.setText(String.valueOf(result));
                }





                if(from.equals("Second") && to.equals("Minute"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value/60;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Second") && to.equals("Second"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Second") && to.equals("Millisecond"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value*1000;
                    result_tv.setText(String.valueOf(result));
                }



                if(from.equals("Second") && to.equals("Hour"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value/3600;
                    result_tv.setText(String.valueOf(result));
                }




                if(from.equals("Millisecond") && to.equals("Minute"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value/(60*1000);
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Millisecond") && to.equals("Second"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value/1000;
                    result_tv.setText(String.valueOf(result));
                }

                if(from.equals("Millisecond") && to.equals("Millisecond"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }



                if(from.equals("Millisecond") && to.equals("Hour"))
                {
                    try{
                        input_value = Double.parseDouble(value_input.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    result = input_value/(3600*1000);
                    result_tv.setText(String.valueOf(result));
                }





            }
        });

        statusbarColour();

            }

    private void statusbarColour(){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            getWindow().setStatusBarColor(getResources().getColor(R.color.time_theme, this.getTheme()));
        }
    }
}