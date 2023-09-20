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

public class Currency_Converter extends AppCompatActivity {

    ArrayList<String> units = new ArrayList<>();

    double result;

    String from;

    String to;

    double input_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        Spinner from_select = findViewById(R.id.from_select);
        Spinner to_select = findViewById(R.id.to_select);
        EditText value_input = findViewById(R.id.value_input);
        TextView result_tv = findViewById(R.id.result_tv);
        Button convert_btn = findViewById(R.id.convert_btn);

        units.add("PKR");
        units.add("USD");
        units.add("CAD");
        units.add("AUD");
        units.add("KWD");
        units.add("AED");
        units.add("SR");
        units.add("INR");
        units.add("GBP");
        units.add("EURO");

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

                if (from.equals("PKR") && to.equals("USD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.003369;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("PKR") && to.equals("EURO")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.003159;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("PKR") && to.equals("GBP")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.002720;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("PKR") && to.equals("KWD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.001041;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("PKR") && to.equals("CAD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.004556;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("PKR") && to.equals("AUD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.005239;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("PKR") && to.equals("AED")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.012372;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("PKR") && to.equals("SR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.012633;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("PKR") && to.equals("INR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.279957;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("PKR") && to.equals("PKR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }


                if (from.equals("USD") && to.equals("USD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("USD") && to.equals("EURO")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.937701;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("USD") && to.equals("GBP")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.807506;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("USD") && to.equals("KWD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.309022;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("USD") && to.equals("CAD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 1.352312;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("USD") && to.equals("AUD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 1.553320;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("USD") && to.equals("AED")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 3.672500;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("USD") && to.equals("SR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 3.750000;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("USD") && to.equals("INR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 83.098906;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("USD") && to.equals("PKR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 296.831997;
                    result_tv.setText(String.valueOf(result));
                }


                if (from.equals("EURO") && to.equals("USD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 1.066438;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("EURO") && to.equals("EURO")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("EURO") && to.equals("GBP")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.861155;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("EURO") && to.equals("KWD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.329552;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("EURO") && to.equals("CAD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 1.442096;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("EURO") && to.equals("AUD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 1.658361;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("EURO") && to.equals("AED")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 3.916493;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("EURO") && to.equals("SR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 3.999141;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("EURO") && to.equals("INR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 88.621285;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("EURO") && to.equals("PKR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 316.552834;
                    result_tv.setText(String.valueOf(result));
                }


                if (from.equals("GBP") && to.equals("USD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 1.238381;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("GBP") && to.equals("EURO")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 1.161231;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("GBP") && to.equals("GBP")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("GBP") && to.equals("KWD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.382687;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("GBP") && to.equals("CAD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 1.674607;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("GBP") && to.equals("AUD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 1.925740;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("GBP") && to.equals("AED")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 4.547953;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("GBP") && to.equals("SR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 4.643928;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("GBP") && to.equals("INR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 102.909800;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("GBP") && to.equals("PKR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 367.591024;
                    result_tv.setText(String.valueOf(result));
                }


                if (from.equals("KWD") && to.equals("USD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 3.236018;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("KWD") && to.equals("EURO")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 3.034419;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("KWD") && to.equals("GBP")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 2.613105;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("KWD") && to.equals("KWD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("KWD") && to.equals("CAD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 4.375922;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("KWD") && to.equals("AUD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 5.032161;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("KWD") && to.equals("AED")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 11.884278;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("KWD") && to.equals("SR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 12.135069;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("KWD") && to.equals("INR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 268.914079;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("KWD") && to.equals("PKR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 960.553819;
                    result_tv.setText(String.valueOf(result));
                }


                if (from.equals("CAD") && to.equals("USD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.739505;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("CAD") && to.equals("EURO")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.693435;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("CAD") && to.equals("GBP")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.597155;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("CAD") && to.equals("KWD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.228523;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("CAD") && to.equals("CAD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("CAD") && to.equals("AUD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 1.149966;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("CAD") && to.equals("AED")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 2.715834;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("CAD") && to.equals("SR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 2.773146;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("CAD") && to.equals("INR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 61.453123;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("CAD") && to.equals("PKR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 219.508892;
                    result_tv.setText(String.valueOf(result));
                }


                if (from.equals("AUD") && to.equals("USD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.643067;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AUD") && to.equals("EURO")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.603005;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AUD") && to.equals("GBP")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.519281;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AUD") && to.equals("KWD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.198722;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AUD") && to.equals("CAD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.869591;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AUD") && to.equals("AUD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AUD") && to.equals("AED")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 2.361665;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AUD") && to.equals("SR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 2.411503;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AUD") && to.equals("INR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 53.439084;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AUD") && to.equals("PKR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 190.882965;
                    result_tv.setText(String.valueOf(result));
                }


                if (from.equals("AED") && to.equals("USD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.272294;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AED") && to.equals("EURO")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.255331;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AED") && to.equals("GBP")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.219879;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AED") && to.equals("KWD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.084145;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AED") && to.equals("CAD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.368211;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AED") && to.equals("AUD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.423430;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AED") && to.equals("AED")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AED") && to.equals("SR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 1.021103;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AED") && to.equals("INR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 22.627717;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("AED") && to.equals("PKR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value / 0.012372;
                    result_tv.setText(String.valueOf(result));
                }


                if (from.equals("SR") && to.equals("USD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.266667;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("SR") && to.equals("EURO")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.250054;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("SR") && to.equals("GBP")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.215335;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("SR") && to.equals("KWD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.082406;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("SR") && to.equals("CAD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.360601;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("SR") && to.equals("AUD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.414679;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("SR") && to.equals("AED")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.979333;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("SR") && to.equals("SR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("SR") && to.equals("INR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 22.160078;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("SR") && to.equals("PKR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value / 79.155199;
                    result_tv.setText(String.valueOf(result));
                }


                if (from.equals("INR") && to.equals("USD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.012034;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("INR") && to.equals("EURO")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.011284;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("INR") && to.equals("GBP")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.009717;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("INR") && to.equals("KWD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.003719;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("INR") && to.equals("CAD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.016273;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("INR") && to.equals("AUD")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.018713;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("INR") && to.equals("AED")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.044194;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("INR") && to.equals("SR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 0.045126;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("INR") && to.equals("INR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value;
                    result_tv.setText(String.valueOf(result));
                }

                if (from.equals("INR") && to.equals("PKR")) {
                    try {
                        input_value = Double.parseDouble(value_input.getText().toString());
                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }

                    result = input_value * 3.571973;
                    result_tv.setText(String.valueOf(result));
                }
            }
        });

        statusbarColour();
    }

    private void statusbarColour() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.currency_theme, this.getTheme()));
        }
    }

}