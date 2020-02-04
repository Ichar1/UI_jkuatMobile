package com.example.charlo.jkuat_mobile_app.Activity.Dashboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.charlo.jkuat_mobile_app.R;

public class Activity_Social extends AppCompatActivity {
    ImageView Fb,Insta,twit,web;
    TextView web2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__social);
        setTitle("Social");

        Fb = findViewById(R.id.facebook);
        Insta = findViewById(R.id.instagram);
        twit = findViewById(R.id.twitter);
        web = findViewById(R.id.jkuatweb);
        web2 = findViewById(R.id.jkuatweb2);

        Fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/JkuatNairobiCbd";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        Insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/explore/locations/1016378297/kenya/nairobi-kenya/jkuat-nairobi-cbd/?hl=nb";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://twitter.com/jkuatnairobicbd?lang=en";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://jkuat.ac.ke/campuses/nairobicbd/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        web2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://jkuat.ac.ke/campuses/nairobicbd/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }
}
