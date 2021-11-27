package com.kelompok2.tasku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class TaskAct extends AppCompatActivity {

    TextView tab_in_progress;
    TextView tab_done;
    ImageView btn_back;
    FloatingActionButton fb_add_task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.tab_first, R.anim.tab_second);
        setContentView(R.layout.activity_task);

        tab_done = findViewById(R.id.tab_done);
        tab_in_progress = findViewById(R.id.tab_in_progress);
        btn_back = findViewById(R.id.btn_back);
        fb_add_task = findViewById(R.id.fb_add_task);

        tab_in_progress.setOnClickListener(v -> {
            Intent toTodo = new Intent(TaskAct.this, InProgressAct.class);
            startActivity(toTodo);
            finish();
        });

        tab_done.setOnClickListener(v -> {
            Intent toDone = new Intent(TaskAct.this, DoneAct.class);
            startActivity(toDone);
            finish();
        });

        btn_back.setOnClickListener(view -> {
            Intent toHome = new Intent(TaskAct.this, HomeAct.class);
            startActivity(toHome);
        });

        fb_add_task.setOnClickListener(v -> {
            Intent toAddTask = new Intent(TaskAct.this, TaskAddAct.class);
            startActivity(toAddTask);
        });
    }
}