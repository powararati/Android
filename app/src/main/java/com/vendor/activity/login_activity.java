package com.vendor.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.vendor.R;

public class login_activity extends AppCompatActivity
{
    Button login;
    TextView forget_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driver_login);

        login = findViewById(R.id.login);
        forget_pass = findViewById(R.id.forget_pass);

        forget_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(login_activity.this, Forget_Password.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(login_activity.this,login_activity.class);
                startActivity(i);
            }
        });
    }
}
