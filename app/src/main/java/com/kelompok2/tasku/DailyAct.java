package com.kelompok2.tasku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DailyAct extends AppCompatActivity {

    ImageView nav_home, nav_task, nav_daily, nav_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        nav_home = findViewById(R.id.nav_home);
        nav_task = findViewById(R.id.nav_task);
        nav_daily = findViewById(R.id.nav_daily);
        nav_profile = findViewById(R.id.nav_profile);
    }

    public void openHome(View view){
        Intent toHome = new Intent(DailyAct.this, HomeAct.class);
        startActivity(toHome);
    }

    public void openTask(View view){
        Intent toTask = new Intent(DailyAct.this, TaskAct.class);
        startActivity(toTask);
    }

    public void openDaily(View view){
        Intent toDaily = new Intent(DailyAct.this, DailyAct.class);
        startActivity(toDaily);
    }

    public void openProfile(View view){
        Intent toProfile = new Intent(DailyAct.this, ProfileAct.class);
        startActivity(toProfile);
    }
}