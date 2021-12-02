package com.kelompok2.tasku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class TaskAddAct extends AppCompatActivity {

    ImageView btn_back;
    private DatePickerDialog datePickerDialog;
    LinearLayout btn_time, btn_datepick, list_subtask, btn_add_subtask;

    private TextView txttime, txtdate;
    int h, m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_add);
        initDatePicker();

        btn_back = findViewById(R.id.btn_back);
        btn_datepick = findViewById(R.id.btn_datepick);
        btn_time = findViewById(R.id.btn_time);
        txttime = findViewById(R.id.txttime);
        txtdate = findViewById(R.id.txtdate);
        list_subtask = findViewById(R.id.list_subtask);
        btn_add_subtask = findViewById(R.id.btn_add_subtask);


        btn_back.setOnClickListener(v -> {
            Intent backtoTask = new Intent(TaskAddAct.this, TaskAct.class);
            startActivity(backtoTask);
        });

        btn_add_subtask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSubtaskView();
            }
        });
    }

    private void addSubtaskView() {
        View subtask = getLayoutInflater().inflate(R.layout.activity_task_add_subtask, null, false);
        CheckBox flag = (CheckBox)subtask.findViewById(R.id.flag);
        EditText subtask_desc = (EditText)subtask.findViewById(R.id.subtask_desc);
        ImageView subtask_del = (ImageView)subtask.findViewById(R.id.btn_del_subtask);

        subtask_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeSubtaskView(subtask);
            }
        });

        list_subtask.addView(subtask);
    }

    private void removeSubtaskView(View v){
        list_subtask.removeView(v);
    }

//    private String getTodaysDate() {
//        Calendar cal = Calendar.getInstance();
//        int year = cal.get(Calendar.YEAR);
//        int month = cal.get(Calendar.MONTH);
//        month = month +1;
//        int day = cal.get(Calendar.DAY_OF_MONTH);
//
//        return makeDateString(day, month, year);
//
//    }

    private void initDatePicker() {
        DatePickerDialog.OnDateSetListener dateSetListener = (view, year, month, dayOfMonth) -> {
            month = month +1;
            String date = makeDateString(dayOfMonth, month, year);
            txtdate.setText(date);
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;
        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);
        datePickerDialog.setTitle("Select Date of the Deadline");
    }

    private String makeDateString(int dayOfMonth, int month, int year) {
        return getMontFormat(month) + " " + dayOfMonth + " " + year;
    }

    private String getMontFormat(int month) {
        if(month == 1)
            return "Jan";
        if(month == 2)
            return "Feb";
        if(month == 3)
            return "Mar";
        if(month == 4)
            return "Apr";
        if(month == 5)
            return "May";
        if(month == 6)
            return "Jun";
        if(month == 7)
            return "Jul";
        if(month == 8)
            return "Aug";
        if(month == 9)
            return "Sep";
        if(month == 10)
            return "Okt";
        if(month == 11)
            return "Nov";
        if(month == 12)
            return "Des";
        //default return
        return "Jan";
    }

    public void openDatePicker(View view){
        datePickerDialog.show();
    }

    public void popTimePicker(View view) {
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePick, int hourOfDay, int minute) {
                h = hourOfDay;
                m = minute;
                txttime.setText(String.format(Locale.getDefault(), "%02d:%02d", h, m));
            }
        };

        int style = AlertDialog.THEME_HOLO_LIGHT;

        TimePickerDialog timePickDialog = new TimePickerDialog(this, style, onTimeSetListener, h, m, true);
        timePickDialog.setTitle("Select Time of the Deadline");
        timePickDialog.show();
    }
}