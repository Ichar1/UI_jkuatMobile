package com.example.charlo.jkuat_mobile_app.Activity.Dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.charlo.jkuat_mobile_app.Activity.Facilities.ComputerlabActivity;
import com.example.charlo.jkuat_mobile_app.Activity.Facilities.DispensaryActivity;
import com.example.charlo.jkuat_mobile_app.Activity.Facilities.Eresources;
import com.example.charlo.jkuat_mobile_app.Activity.Facilities.LibraryActivity;
import com.example.charlo.jkuat_mobile_app.R;
import com.example.charlo.jkuat_mobile_app.Activity.Facilities.StudentscenterActivity;

public class Activity_Facilities extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);
        setTitle("Facilities");

        //initComponent();

        findViewById(R.id.studentcentre).setOnClickListener(this);
        findViewById(R.id.library).setOnClickListener(this);
        findViewById(R.id.computerlab).setOnClickListener(this);
        findViewById(R.id.dispensary).setOnClickListener(this);
        findViewById(R.id.eresources).setOnClickListener(this);
    }






    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.studentcentre:
                startActivity(new Intent(getApplicationContext(), StudentscenterActivity.class));
                break;

            case R.id.library:
                startActivity(new Intent(getApplicationContext(), LibraryActivity.class));
                break;

            case R.id.computerlab:
                startActivity(new Intent(getApplicationContext(), ComputerlabActivity.class));
                break;

            case R.id.dispensary:
                startActivity(new Intent(getApplicationContext(), DispensaryActivity.class));
                break;
            case R.id.eresources:
                startActivity(new Intent(getApplicationContext(), Eresources.class));
                break;
        }
    }

}
