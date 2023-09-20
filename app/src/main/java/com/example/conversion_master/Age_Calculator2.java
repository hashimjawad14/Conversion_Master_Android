package com.example.conversion_master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Age_Calculator2 extends AppCompatActivity {

    int month_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_calculator2);

        TextView year_bg = findViewById(R.id.year_bg);
        TextView month_bg = findViewById(R.id.month_bg);
        TextView day_bg = findViewById(R.id.day_bg);
        TextView total_years = findViewById(R.id.total_years);
        TextView total_months = findViewById(R.id.total_months);
        TextView total_days = findViewById(R.id.total_days);
        TextView total_hours = findViewById(R.id.total_hours);
        TextView total_minutes = findViewById(R.id.total_minutes);
        TextView total_seconds = findViewById(R.id.total_seconds);
        TextView dob_msg = findViewById(R.id.dob_msg);
        TextView days_left = findViewById(R.id.days_left);
        TextView birthday = findViewById(R.id.birthday);


        Intent get = getIntent();
        int day = get.getIntExtra("day", 0);
        String select_month = get.getStringExtra("month");
        int year = get.getIntExtra("year", 0);


        if (select_month.equals("January")) {
            month_num = 1;
        } else if (select_month.equals("February")) {
            month_num = 2;
        } else if (select_month.equals("March")) {
            month_num = 3;
        } else if (select_month.equals("April")) {
            month_num = 4;
        } else if (select_month.equals("May")) {
            month_num = 5;
        } else if (select_month.equals("June")) {
            month_num = 6;
        } else if (select_month.equals("July")) {
            month_num = 7;
        } else if (select_month.equals("August")) {
            month_num = 8;
        } else if (select_month.equals("September")) {
            month_num = 9;
        } else if (select_month.equals("October")) {
            month_num = 10;
        } else if (select_month.equals("November")) {
            month_num = 11;
        } else if (select_month.equals("December")) {
            month_num = 12;
        }



        LocalDate current_date = LocalDate.now();
        LocalDate dob = LocalDate.of(year, month_num, day);

        // Calculate the difference in days, months, and years
        Period period = Period.between(dob, current_date);

        // Calculate the difference in seconds, hours, and minutes
        LocalDateTime dateTime1 = dob.atStartOfDay();
        LocalDateTime dateTime2 = current_date.atStartOfDay();
        Duration duration = Duration.between(dateTime1, dateTime2);

        long days = period.getDays();
        long months = period.getMonths();
        long years = period.getYears();

        long seconds = duration.getSeconds();
        long hours = seconds / 3600;
        long minutes = seconds / 60;

        year_bg.setText(String.valueOf(years));
        month_bg.setText(String.valueOf(months));
        day_bg.setText(String.valueOf(days));
        total_years.setText(String.valueOf(years));
        total_months.setText(String.valueOf(years*12));
        total_days.setText(String.valueOf(years*12*365));
        total_hours.setText(String.valueOf(hours));
        total_minutes.setText(String.valueOf(minutes));
        total_seconds.setText(String.valueOf(seconds));

        dob_msg.setText("for DOB "+day+"/"+month_num+"/"+year);

        if (dob.equals(current_date))
        {
            Toast.makeText(this, "Happy Birthday!", Toast.LENGTH_LONG).show();
        }



        // Calculate the upcoming birthday
        LocalDate upcomingBirthday = calculateUpcomingBirthday(dob, current_date);

        // Calculate the number of days left for the upcoming birthday
        long daysLeft = Period.between(current_date, upcomingBirthday).getDays();

        // Determine the day of the week for the upcoming birthday
        DayOfWeek dayOfWeek = upcomingBirthday.getDayOfWeek();


        days_left.setText(String.valueOf(daysLeft));
        birthday.setText(String.valueOf(dayOfWeek));


    }


    private static LocalDate calculateUpcomingBirthday(LocalDate dateOfBirth, LocalDate currentDate) {
        LocalDate upcomingBirthday = dateOfBirth.withYear(currentDate.getYear());

        if (upcomingBirthday.isBefore(currentDate) || upcomingBirthday.isEqual(currentDate)) {
            upcomingBirthday = upcomingBirthday.plusYears(1);
        }

        return upcomingBirthday;
    }

}