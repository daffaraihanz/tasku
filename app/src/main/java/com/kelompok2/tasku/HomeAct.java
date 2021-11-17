package com.kelompok2.tasku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeAct extends AppCompatActivity {

    LinearLayout card_todo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        card_todo = findViewById(R.id.card_todo);
        card_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTask = new Intent(HomeAct.this, TaskAct.class);
                startActivity(toTask);
                finish();
            }
        });
    }
}