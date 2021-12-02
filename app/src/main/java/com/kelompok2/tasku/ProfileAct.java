package com.kelompok2.tasku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ProfileAct extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    ImageView nav_home, nav_task, nav_daily, nav_profile;


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        nav_home = findViewById(R.id.nav_home);
        nav_task = findViewById(R.id.nav_task);
        nav_daily = findViewById(R.id.nav_daily);
        nav_profile = findViewById(R.id.nav_profile);

    }

/*Pop Up Settings*/
    public void popUpSet(View view){
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }


    //show popup
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.edit:
                return true;
            case R.id.logout:
                Intent goOut = new Intent(ProfileAct.this, LoginAct.class);
                startActivity(goOut);
                finish();
                return true;
        }
        return false;
    }

    /*Navigation Buttom*/
    public void openHome(View view){
        Intent toHome = new Intent(ProfileAct.this, HomeAct.class);
        startActivity(toHome);
    }

    public void openTask(View view){
        Intent toTask = new Intent(ProfileAct.this, TaskAct.class);
        startActivity(toTask);
    }

    public void openDaily(View view){
        Intent toDaily = new Intent(ProfileAct.this, DailyAct.class);
        startActivity(toDaily);
    }

    public void openProfile(View view){
        Intent toProfile = new Intent(ProfileAct.this, ProfileAct.class);
        startActivity(toProfile);
    }

}