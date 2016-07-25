package com.terry.sliding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends AppCompatActivity {

    SlidingMenu slidingleft, slidingright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slidingleft();
        slidingright();
        findViewById(R.id.leftbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slidingleft.toggle();
            }
        });
        findViewById(R.id.rightbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slidingright.toggle();
            }
        });
    }

    private void slidingleft() {
        slidingleft = new SlidingMenu(this);
        slidingleft.setMenu(R.layout.slidingleft);
        slidingleft.setMode(SlidingMenu.LEFT);
        slidingleft.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingleft.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        slidingleft.setFadeDegree(0.35f);
        slidingleft.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
    }

    private void slidingright() {
        slidingright = new SlidingMenu(this);
        slidingright.setMenu(R.layout.slidingright);
        slidingright.setMode(SlidingMenu.RIGHT);
        slidingright.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingright.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        slidingright.setFadeDegree(0.35f);
        slidingright.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
    }
}
