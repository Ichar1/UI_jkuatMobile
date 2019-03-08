package com.example.charlo.jkuat_mobile_app.Activity.Facilities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.charlo.jkuat_mobile_app.R;

public class LibraryActivity extends AppCompatActivity {

    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        setTitle("Library");

        viewFlipper = findViewById(R.id.VFlipper);

        int images[] = {R.drawable.library,
                R.drawable.lib,
                R.drawable.lib2,};


        for (int image : images) {
            startFlip(image);
        }

    }

    private void startFlip(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this, android.R.anim.fade_in);
        viewFlipper.setOutAnimation(this, android.R.anim.fade_out);
    }
}


