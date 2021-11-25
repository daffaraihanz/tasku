package com.kelompok2.tasku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterSuccessAct extends AppCompatActivity {

    Button button_masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_success);

        button_masuk = findViewById(R.id.button_masuk);

        button_masuk.setOnClickListener(view -> {
            Intent toLogin = new Intent(RegisterSuccessAct.this, LoginAct.class);
            startActivity(toLogin);
        });
    }
}