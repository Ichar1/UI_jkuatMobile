package com.example.charlo.jkuat_mobile_app.Activity.Dashboard;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.charlo.jkuat_mobile_app.R;
import com.example.charlo.jkuat_mobile_app.Adapters.Tools;
import com.example.charlo.jkuat_mobile_app.Adapters.ViewAnimation;


public class Activity_Timetable extends AppCompatActivity{

    private NestedScrollView nested_scroll_view;
    private ImageButton bt_toggle_text,bt_toggle_text1,bt_toggle_text2;
    private View lyt_expand_text,lyt_expand_text1,lyt_expand_text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__timetable);
        setTitle("Timetable");

        initComponent();

    }


    private void initComponent() {

        // text section
        bt_toggle_text = findViewById(R.id.bt_toggle_text);
        bt_toggle_text1 = findViewById(R.id.bt_toggle_text1);
        bt_toggle_text2 = findViewById(R.id.bt_toggle_text2);

        lyt_expand_text = findViewById(R.id.lyt_expand_text);
        lyt_expand_text.setVisibility(View.GONE);
        lyt_expand_text1 = findViewById(R.id.lyt_expand_text1);
        lyt_expand_text1.setVisibility(View.GONE);
        lyt_expand_text2 = findViewById(R.id.lyt_expand_text2);
        lyt_expand_text2.setVisibility(View.GONE);

        bt_toggle_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionText(bt_toggle_text);
            }
        });

        bt_toggle_text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleSectionText1(bt_toggle_text1);
            }
        });
        bt_toggle_text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleSectionText2(bt_toggle_text2);
            }
        });

        // nested scrollview
        nested_scroll_view = findViewById(R.id.nested_scroll_view);
    }

    private void toggleSectionText(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_text, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_text);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_text);
        }
    }

    private void toggleSectionText1(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_text1, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_text1);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_text1);
        }
    }

    private void toggleSectionText2(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_text2, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_text2);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_text2);
        }
    }

    public boolean toggleArrow(View view) {
        if (view.getRotation() == 0) {
            view.animate().setDuration(200).rotation(180);
            return true;
        } else {
            view.animate().setDuration(200).rotation(0);
            return false;
        }
    }

}
