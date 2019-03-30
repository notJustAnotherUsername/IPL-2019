package com.santanu.customarrayadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Button fullScheduleButton = findViewById(R.id.full_schedule_button);
        Button todaysMatch = findViewById(R.id.today_match_button);

        fullScheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(InfoActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });

        todaysMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());

                Date c = Calendar.getInstance().getTime();
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                String formattedDate = df.format(c);



                Intent i = new Intent(InfoActivity.this,TodayMatch.class);

                i.putExtra("today",formattedDate);
                startActivity(i);
            }
        });
    }
}
