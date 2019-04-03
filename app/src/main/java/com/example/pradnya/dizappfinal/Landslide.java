package com.example.pradnya.dizappfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Landslide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landslide);
        defineCardViews();
    }
    public void defineCardViews() {

        CardView before3 = (CardView) findViewById(R.id.before3);
        CardView during3 = (CardView) findViewById(R.id.during3);
        CardView after3 = (CardView) findViewById(R.id.after3);

        before3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(view.getContext(), LandslideBefore.class);
                startActivity(i1);
            }
        });

        during3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(view.getContext(), LandslideDuring.class);
                startActivity(i2);
            }
        });

        after3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(view.getContext(), LandslideAfter.class);
                startActivity(i3);
            }
        });
    }
}