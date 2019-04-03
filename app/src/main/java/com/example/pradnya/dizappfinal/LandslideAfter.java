package com.example.pradnya.dizappfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LandslideAfter extends AppCompatActivity {
    private ViewPager slideviewPager;
    private LinearLayout dotlayout;
    private LandslideAfterAdapter sliderAdapter;
    private TextView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landslide_after);

        slideviewPager = (ViewPager) findViewById(R.id.slideviewpager);
        dotlayout = (LinearLayout) findViewById(R.id.dotlayout);

        sliderAdapter = new LandslideAfterAdapter(this);
        slideviewPager.setAdapter(sliderAdapter);

        addDotsindicator(0);
        slideviewPager.addOnPageChangeListener(viewListener);
    }

    public void addDotsindicator(int position) {

        dots = new TextView[5];
        dotlayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            dotlayout.addView(dots[i]);
        }
        if (dots.length > 0) {
            dots[position].setTextColor(getResources().getColor(R.color.colorBlack));

        }
    }


    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsindicator(i);

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}

