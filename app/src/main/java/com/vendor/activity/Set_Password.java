package com.vendor.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.vendor.R;

public class Set_Password extends AppCompatActivity
{
    Button set_new_password_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_password);

        set_new_password_btn = findViewById(R.id.set_new_password_btn);

        set_new_password_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Set_Password.this,Password_Updated.class);
                startActivity(i);
            }
        });
    }
}
