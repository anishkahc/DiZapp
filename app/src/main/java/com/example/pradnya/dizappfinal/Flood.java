package com.example.pradnya.dizappfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Flood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flood);
        defineCardViews();
    }
    public void defineCardViews() {

        CardView before2 = (CardView) findViewById(R.id.before2);
        CardView during2 = (CardView) findViewById(R.id.during2);
        CardView after2 = (CardView) findViewById(R.id.after2);

        before2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(view.getContext(), FloodBefore.class);
                startActivity(i1);
            }
        });

        during2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(view.getContext(), FloodDuring.class);
                startActivity(i2);
            }
        });

        after2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(view.getContext(), FloodAfter.class);
                startActivity(i3);
            }
        });
    }
}