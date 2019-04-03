package com.example.pradnya.dizappfinal;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.pradnya.dizappfinal.Helper.LocalHelper;

import io.paperdb.Paper;
public class Earthquake extends AppCompatActivity {

    TextView textview1;
    TextView textview2;
    TextView textview3;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocalHelper.onAttach(newBase, "en"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);
        defineCardViews();

        Paper.init(this);

        String language = Paper.book().read("language");
        if (language == null)
            Paper.book().write("language", "en");

        updateView((String) Paper.book().read("language"));

        textview1 = (TextView) findViewById(R.id.textview1);
        textview2 = (TextView) findViewById(R.id.textview2);
        textview3 = (TextView) findViewById(R.id.textview3);

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
    public void defineCardViews() {

        CardView before1 = (CardView) findViewById(R.id.before1);
        CardView during1 = (CardView) findViewById(R.id.during1);
        CardView after1 = (CardView) findViewById(R.id.after1);

        before1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(view.getContext(), EarthquakeBefore.class);
                startActivity(i1);
            }
        });

        during1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(view.getContext(), EarthquakeDuring.class);
                startActivity(i2);
            }
        });

        after1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(view.getContext(), EarthquakeAfter.class);
                startActivity(i3);
            }
        });
    }
}