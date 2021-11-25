package com.kelompok2.tasku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InProgressAct extends AppCompatActivity {

    TextView tab_todo;
    TextView tab_done;
    ImageView btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.tab_first, R.anim.tab_second);
        setContentView(R.layout.activity_in_progress);

        tab_todo = findViewById(R.id.tab_todo);
        tab_done = findViewById(R.id.tab_done);
        btn_back = findViewById(R.id.btn_back);

        tab_todo.setOnClickListener(v -> {
            Intent toTodo = new Intent(InProgressAct.this, TaskAct.class);
            startActivity(toTodo);
            finish();
        });

        tab_done.setOnClickListener(v -> {
            Intent toDone = new Intent(InProgressAct.this, DoneAct.class);
            startActivity(toDone);
            finish();
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toHome = new Intent(InProgressAct.this, HomeAct.class);
                startActivity(toHome);
            }
        });
    }
}