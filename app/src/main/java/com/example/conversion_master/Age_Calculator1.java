package com.example.conversion_master;

import androidx.appcompat.app.AppCompatActivity;


import java.time.LocalDate;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Age_Calculator1 extends AppCompatActivity {

    ArrayList<Integer> day = new ArrayList<Integer>();
    String[] month;
    Integer[] year;



    int select_day;
    String select_month;

    int select_year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_calculator1);

        ImageView cal_pic = findViewById(R.id.cal_pic);
        TextView dob_tv = findViewById(R.id.dob_tv);
        TextView cdate_tv = findViewById(R.id.cdate_tv);
        Spinner day_spinner = findViewById(R.id.day_spinner);
        Spinner month_spinner = findViewById(R.id.month_spinner);
        Spinner year_spinner = findViewById(R.id.year_spinner);
        Button calc_btn = findViewById(R.id.calc_btn);


            LocalDate currentDate = LocalDate.now();

        cdate_tv.setText(String.format(String.valueOf(currentDate)));

        day.add(1);
        day.add(2);
        day.add(3);
        day.add(4);
        day.add(5);
        day.add(6);
        day.add(7);
        day.add(8);
        day.add(9);
        day.add(10);
        day.add(11);
        day.add(12);
        day.add(13);
        day.add(14);
        day.add(15);
        day.add(16);
        day.add(17);
        day.add(18);
        day.add(19);
        day.add(20);
        day.add(21);
        day.add(22);
        day.add(23);
        day.add(24);
        day.add(25);
        day.add(26);
        day.add(27);
        day.add(28);
        day.add(29);
        day.add(30);
        day.add(31);

        month = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        year = new Integer[]{1940, 1941, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1961, 1962, 1963, 1964, 1965, 1966, 1967, 1968, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023};

        ArrayAdapter day_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, day);
        ArrayAdapter month_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, month);
        ArrayAdapter year_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, year);


        day_spinner.setAdapter(day_adapter);
        month_spinner.setAdapter(month_adapter);
        year_spinner.setAdapter(year_adapter);

        day_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.getItemAtPosition(position);
                day_spinner.setSelection(position);
                select_day = Integer.parseInt(day_spinner.getSelectedItem().toString());
                select_month = month_spinner.getSelectedItem().toString();
                select_year = Integer.parseInt(year_spinner.getSelectedItem().toString());

                dob_tv.setText(select_day+"-"+select_month+"-"+select_year);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        month_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.getItemAtPosition(position);
                month_spinner.setSelection(position);
                select_month = month_spinner.getSelectedItem().toString();
                select_year = Integer.parseInt(year_spinner.getSelectedItem().toString());
                select_day = Integer.parseInt(day_spinner.getSelectedItem().toString());

                dob_tv.setText(select_day+"-"+select_month+"-"+select_year);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        year_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.getItemAtPosition(position);
                year_spinner.setSelection(position);
                select_day = Integer.parseInt(day_spinner.getSelectedItem().toString());
                select_month = month_spinner.getSelectedItem().toString();
                select_year = Integer.parseInt(year_spinner.getSelectedItem().toString());

                dob_tv.setText(select_day+"-"+select_month+"-"+select_year);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





        calc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Age_Calculator1.this, Age_Calculator2.class);
                intent.putExtra("day", select_day);
                intent.putExtra("month", select_month);
                intent.putExtra("year", select_year);
                startActivity(intent);

            }
        });













    }



}