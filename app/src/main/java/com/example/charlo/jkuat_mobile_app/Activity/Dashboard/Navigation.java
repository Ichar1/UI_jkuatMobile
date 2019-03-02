package com.example.charlo.jkuat_mobile_app.Activity.Dashboard;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.charlo.jkuat_mobile_app.R;

public class Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    ImageView imgEvents, imgCourses, imgTimetable, imgSocial, imgFacilities,imgClubs;
    CardView cardEvents, cardCourses, cardTimetable, cardSocial, cardFacilities, cardClubs ;
    private ViewFlipper viewFlipper;
    //ImageView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        viewFlipper = findViewById(R.id.v_flipper);

        int images[] ={R.drawable.image_7,
                R.drawable.image_8,
                R.drawable.jkuatbldng1,};



        for(int image: images){
            startFlipping(image);
        }


        initComponents();



    }


    private void startFlipping(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this,android.R.anim.fade_in);
        viewFlipper.setOutAnimation(this,android.R.anim.fade_out);

    }



    private void initComponents(){

        findViewById(R.id.events_card).setOnClickListener(this);
        findViewById(R.id.courses_card).setOnClickListener(this);
        findViewById(R.id.timetable_card).setOnClickListener(this);
        findViewById(R.id.social_card).setOnClickListener(this);
        findViewById(R.id.facilities_card).setOnClickListener(this);
        findViewById(R.id.clubs_card).setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_admin) {

        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_campuses) {

        } else if (id == R.id.AboutUs) {
            startActivity(new Intent(getApplicationContext(),Admin.class));

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.events_card:
                startActivity(new Intent(getApplicationContext(),Activity_Events.class));
                break;
            case R.id.social_card:
                startActivity(new Intent(getApplicationContext(),Activity_Social.class));
                break;
            case R.id.facilities_card:
                startActivity(new Intent(getApplicationContext(),Activity_Facilities.class));
            case R.id.clubs_card:
                startActivity(new Intent(getApplicationContext(),Activity_Clubs.class));
                break;
            case R.id.timetable_card:
                startActivity(new Intent(getApplicationContext(),Activity_Timetable.class));
                break;
            case R.id.courses_card:
                startActivity(new Intent(getApplicationContext(),Activity_Courses.class));
                break;
        }

    }
}
