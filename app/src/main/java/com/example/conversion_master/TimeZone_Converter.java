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
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TimeZone_Converter extends AppCompatActivity {

    ArrayList<String> units1 = new ArrayList<>();

    ArrayList<String> units2 = new ArrayList<>();

    ArrayList<String> am_pm = new ArrayList<>();

    String from;

    String to;

    int input_min;

    int input_hr;

    int output_min;

    int output_hr;

    String am_pm_selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_zone_converter);


        Spinner from_select = findViewById(R.id.from_select);
        Spinner to_select = findViewById(R.id.to_select);
        EditText hour = findViewById(R.id.input_hr);
        EditText min = findViewById(R.id.input_min);
        Spinner am_pm_select = findViewById(R.id.am_pm);
        TextView result_tv = findViewById(R.id.result_tv);
        Button convert_btn = findViewById(R.id.convert_btn);

        units2.add("Pakistan Time");
        units1.add("Belgium Time");

        am_pm.add("AM");
        am_pm.add("PM");

        ArrayAdapter<String> spinner_adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, units1);
        ArrayAdapter<String> spinner_adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, units2);
        ArrayAdapter<String> am_pm_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, am_pm);
        am_pm_select.setAdapter(am_pm_adapter);
        from_select.setAdapter(spinner_adapter1);
        to_select.setAdapter(spinner_adapter2);

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

        am_pm_select.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                parent.getItemAtPosition(position);
                am_pm_select.setSelection(position);
                am_pm_selection = am_pm_select.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(from.equals("Belgium Time") && to.equals("Pakistan Time"))
                {
                    try{
                        input_hr = Integer.parseInt(hour.getText().toString());
                        input_min = Integer.parseInt(min.getText().toString());
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }

                    if (input_hr>12 || input_min>=60)
                    {
                        Toast.makeText(TimeZone_Converter.this, "Invalid Time Input", Toast.LENGTH_LONG).show();
                        result_tv.setText("");
                    }

                    else {
                        if ((input_hr == 9 && input_min >= 0))

                        {  if(am_pm_selection.equals("AM")) {

                            output_hr = 12;
                            output_min = input_min;

                            am_pm_selection = "PM";

                            result_tv.setText(String.valueOf(output_hr) + ":" + String.valueOf(output_min) + "0 " + am_pm_selection);

                        }

                        else if(am_pm_selection.equals("PM")){
                                    output_hr = 12;
                                    output_min = input_min;

                                    am_pm_selection = "AM";



                                    result_tv.setText(String.valueOf(output_hr)+":"+String.valueOf(output_min)+"0 "+am_pm_selection);

                            }
                        }

                       else if ((input_hr > 9 && input_min >= 0))

                        {  if (am_pm_selection.equals("AM")) {

                            output_hr = (input_hr - 12) + 3;
                            output_min = input_min;

                            am_pm_selection = "PM";

                            result_tv.setText(String.valueOf(output_hr) + ":" + String.valueOf(output_min) + " " + am_pm_selection);

                        }

                           else if(am_pm_selection.equals("PM"))
                        {   output_hr = (input_hr-12)+3;
                                output_min = input_min;

                                am_pm_selection = "AM";

                                result_tv.setText(String.valueOf(output_hr)+":"+String.valueOf(output_min)+" "+am_pm_selection);

                        }
                        }

                        else {

                            output_hr = input_hr + 3;
                            output_min = input_min;

                            result_tv.setText(String.valueOf(output_hr)+":"+String.valueOf(output_min)+" "+am_pm_selection);

                        }
                    }
                }

            }
        });

        statusbarColour();

    }

    private void statusbarColour(){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            getWindow().setStatusBarColor(getResources().getColor(R.color.tz_theme, this.getTheme()));
        }
    }
}