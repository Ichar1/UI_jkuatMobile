package com.example.charlo.jkuat_mobile_app.Authentication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.charlo.jkuat_mobile_app.Activity.Dashboard.Navigation;
import com.example.charlo.jkuat_mobile_app.R;

public class Login extends Activity {
    TextView txtSignup;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //requestWindowFeature(Window.FEATURE_ACTION_BAR);

        txtSignup = findViewById(R.id.sign_up);
        btnLogin = findViewById(R.id.Login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Navigation.class));
            }
        });

        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Signup.class));
            }
        });


    }
}
