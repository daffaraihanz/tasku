package com.kelompok2.tasku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DoneAct extends AppCompatActivity {

    TextView tab_todo;
    TextView tab_in_progress;
    ImageView btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.tab_first, R.anim.tab_second);
        setContentView(R.layout.activity_done);

        tab_todo = findViewById(R.id.tab_todo);
        tab_in_progress = findViewById(R.id.tab_in_progress);
        btn_back = findViewById(R.id.btn_back);

        tab_todo.setOnClickListener(v -> {
            Intent toTodo = new Intent(DoneAct.this, TaskAct.class);
            startActivity(toTodo);
            finish();
        });

        tab_in_progress.setOnClickListener(v -> {
            Intent toProgress = new Intent(DoneAct.this, InProgressAct.class);
            startActivity(toProgress);
            finish();
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toHome = new Intent(DoneAct.this, HomeAct.class);
                startActivity(toHome);
            }
        });
    }
}