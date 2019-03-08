package com.example.charlo.jkuat_mobile_app.Authentication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.charlo.jkuat_mobile_app.Authentication.Login;
import com.example.charlo.jkuat_mobile_app.R;

public class Signup extends AppCompatActivity {

    TextView txtSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        txtSignin = findViewById(R.id.sign_in);

        txtSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });
    }

}