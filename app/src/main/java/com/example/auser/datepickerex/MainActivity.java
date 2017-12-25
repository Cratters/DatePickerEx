package com.example.auser.datepickerex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    DatePicker datePicker;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        button.setOnClickListener(onClickListener);
        Calendar calendar = Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),onDateChangedListener);

    }

    void findViews() {
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        button = (Button) findViewById(R.id.button);
    }

    Button.OnClickListener onClickListener = new  View.OnClickListener() {

        @Override
        public void onClick(View v) {
            int year = datePicker.getYear();
            int month = datePicker.getMonth()+1;
            int day = datePicker.getDayOfMonth();
            Toast.makeText(MainActivity.this, year + "/" + month + "/" + day,Toast.LENGTH_SHORT).show();
        }
    };

    DatePicker.OnDateChangedListener onDateChangedListener = new DatePicker.OnDateChangedListener() {

        @Override
        public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            Toast.makeText(MainActivity.this, "日期為:"+year + "/" + (monthOfYear+1) + "/" + dayOfMonth,Toast.LENGTH_SHORT).show();
        }
    };
}
