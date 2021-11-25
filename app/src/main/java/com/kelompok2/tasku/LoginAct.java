package com.kelompok2.tasku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginAct extends AppCompatActivity {

    Button button_masuk;
    TextView button_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.splash_first, R.anim.splash_second);
        setContentView(R.layout.activity_login);

        button_masuk = findViewById(R.id.button_masuk);
        button_daftar = findViewById(R.id.button_daftar);

        button_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHome = new Intent(LoginAct.this, HomeAct.class);
                startActivity(toHome);
                finish();
            }
        });

        button_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toRegister = new Intent(LoginAct.this, RegisterAct.class);
                startActivity(toRegister);
            }
        });
    }


}