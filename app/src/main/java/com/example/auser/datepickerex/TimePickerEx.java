package com.example.auser.datepickerex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerEx extends AppCompatActivity {

    TimePicker timePicker;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_ex);
        findViews();
        button.setOnClickListener(onClickListener);
    }

    void findViews() {
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        button = (Button) findViewById(R.id.button);
    }

    Button.OnClickListener onClickListener = new  View.OnClickListener() {

        @Override
        public void onClick(View v) {
            int hour = timePicker.getCurrentHour();
            int minute = timePicker.getCurrentMinute();
            Toast.makeText(TimePickerEx.this, hour + "：" + minute,Toast.LENGTH_SHORT).show();
        }
    };
}
