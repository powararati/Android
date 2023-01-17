package com.vendor.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.vendor.R;

public class OTPVerify extends AppCompatActivity
{
    LinearLayout ll_confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started_verify_otp);

        ll_confirm = findViewById(R.id.ll_confirm);

        ll_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(OTPVerify.this, Set_Password.class);
                startActivity(i);
            }
        });
    }
}
