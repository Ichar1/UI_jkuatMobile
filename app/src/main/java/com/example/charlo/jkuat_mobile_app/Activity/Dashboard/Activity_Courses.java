package com.example.charlo.jkuat_mobile_app.Activity.Dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.charlo.jkuat_mobile_app.Activity.Courses.Courses_Bachelors;
import com.example.charlo.jkuat_mobile_app.Activity.Courses.Courses_Certificate;
import com.example.charlo.jkuat_mobile_app.Activity.Courses.Courses_Diploma;
import com.example.charlo.jkuat_mobile_app.Activity.Courses.Courses_Masters;
import com.example.charlo.jkuat_mobile_app.Activity.Courses.Courses_mba;
import com.example.charlo.jkuat_mobile_app.Activity.Courses.Courses_phd;
import com.example.charlo.jkuat_mobile_app.Activity.Courses.Courses_short;
import com.example.charlo.jkuat_mobile_app.R;

public class Activity_Courses extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__courses);
        setTitle("Courses");

        initComponents();


    }

    private void initComponents(){

        findViewById(R.id.card_phd).setOnClickListener(this);
        findViewById(R.id.txt_phd).setOnClickListener(this);
        findViewById(R.id.card_masters).setOnClickListener(this);
        findViewById(R.id.txt_masters).setOnClickListener(this);
        findViewById(R.id.card_mba).setOnClickListener(this);
        findViewById(R.id.txt_mba).setOnClickListener(this);
        findViewById(R.id.card_bachelors).setOnClickListener(this);
        findViewById(R.id.txt_bachelors).setOnClickListener(this);
        findViewById(R.id.card_diploma).setOnClickListener(this);
        findViewById(R.id.txt_diploma).setOnClickListener(this);
        findViewById(R.id.card_certificate).setOnClickListener(this);
        findViewById(R.id.txt_certificate).setOnClickListener(this);
        findViewById(R.id.card_shortcourses).setOnClickListener(this);
        findViewById(R.id.txt_shortcourses).setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.card_phd:
                startActivity(new Intent(getApplicationContext(), Courses_phd.class));
                break;
            case R.id.txt_phd:
                startActivity(new Intent(getApplicationContext(), Courses_phd.class));
                break;
            case R.id.card_masters:
                startActivity(new Intent(getApplicationContext(), Courses_Masters.class));
                break;
            case R.id.txt_masters:
                startActivity(new Intent(getApplicationContext(), Courses_Masters.class));
                break;
            case R.id.card_mba:
                startActivity(new Intent(getApplicationContext(), Courses_mba.class));
                break;
            case R.id.txt_mba:
                startActivity(new Intent(getApplicationContext(), Courses_mba.class));
                break;
            case R.id.card_bachelors:
                startActivity(new Intent(getApplicationContext(), Courses_Bachelors.class));
                break;
            case R.id.txt_bachelors:
                startActivity(new Intent(getApplicationContext(), Courses_Bachelors.class));
                break;
            case R.id.card_diploma:
                startActivity(new Intent(getApplicationContext(), Courses_Diploma.class));
                break;
            case R.id.txt_diploma:
                startActivity(new Intent(getApplicationContext(), Courses_Diploma.class));
                break;
            case R.id.card_certificate:
                startActivity(new Intent(getApplicationContext(), Courses_Certificate.class));
                break;
            case R.id.txt_certificate:
                startActivity(new Intent(getApplicationContext(), Courses_Certificate.class));
                break;
            case R.id.card_shortcourses:
                startActivity(new Intent(getApplicationContext(), Courses_short.class));
                break;
            case R.id.txt_shortcourses:
                startActivity(new Intent(getApplicationContext(), Courses_short.class));
                break;
        }

    }
}

