package com.kelompok2.tasku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterAct extends AppCompatActivity {

    Button button_daftar;
    TextView button_masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button_daftar = findViewById(R.id.button_daftar);
        button_masuk = findViewById(R.id.button_masuk);

        button_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLogin = new Intent(RegisterAct.this, LoginAct.class);
                startActivity(toLogin);
            }
        });

        button_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toRegisterSuccess = new Intent(RegisterAct.this, RegisterSuccessAct.class);
                startActivity(toRegisterSuccess);
            }
        });
    }
}