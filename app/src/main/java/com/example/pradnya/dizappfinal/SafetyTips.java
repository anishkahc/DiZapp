package com.example.pradnya.dizappfinal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

import com.example.pradnya.dizappfinal.Helper.LocalHelper;

import io.paperdb.Paper;

public class SafetyTips extends AppCompatActivity {

    GridLayout mainGrid;

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocalHelper.onAttach(newBase, "en"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety_tips);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);
        //setSingleEvent(mainGrid);

        //card click
       CardView earthquake = (CardView) findViewById(R.id.earthquake);
        earthquake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i1 = new Intent(view.getContext(), Earthquake.class);
                startActivity(i1);

            }
        });

        //card click
        CardView landslide = (CardView) findViewById(R.id.landslide);
        landslide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i2 = new Intent(view.getContext(), Landslide.class);
                startActivity(i2);

            }
        });

        //card click
        CardView flood = (CardView) findViewById(R.id.flood);
        flood.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i3 = new Intent(view.getContext(), Flood.class);
                startActivity(i3);

            }
        });

        //card click
        CardView survival_kit = (CardView) findViewById(R.id.survival_kit);
        survival_kit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i4 = new Intent(view.getContext(), SurvivalKit.class);
                startActivity(i4);

            }
        });

        //translation code starts here
        Paper.init(this);

        String language = Paper.book().read("language");
        if (language == null)
            Paper.book().write("language", "en");

        updateView((String) Paper.book().read("language"));

        textView1 = (TextView) findViewById(R.id.textGrid);
        textView2 = (TextView) findViewById(R.id.earthquaketext);
        textView3 = (TextView) findViewById(R.id.landslidetext);
        textView4 = (TextView) findViewById(R.id.floodtext);
        textView5 = (TextView) findViewById(R.id.SKtext);
    }

    private void updateView(String lang) {
        Context context = LocalHelper.setLocale(this, lang);
        Resources resources = context.getResources();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.language_en) {
            Paper.book().write("language", "en");
            updateView((String) Paper.book().read("language"));

        } else if (item.getItemId() == R.id.language_hi) {
            Paper.book().write("language", "hi");
            updateView((String) Paper.book().read("language"));

        }
        return true;
    }



}
