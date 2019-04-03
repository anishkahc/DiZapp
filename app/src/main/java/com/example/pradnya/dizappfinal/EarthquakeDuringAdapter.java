package com.example.pradnya.dizappfinal;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by PRADNYA on 23-03-2018.
 */

public class EarthquakeDuringAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public EarthquakeDuringAdapter(Context context){
        this.context = context;
    }
    //Arrays
    public int[] slide_images = {

            R.drawable.earth_during_step1,
            R.drawable.earth_during_step2,
            R.drawable.earth_during_step3,
            R.drawable.earth_during_step4,
            R.drawable.earth_during_step5
    };
    public String[] slide_descs = {
            "Steady yourself. Hold onto a solid object or get to the floor so that you do not fall. Try to hide under a piece of furniture.",
            "Cover your head and neck. Use your hands and arms to protect these vital areas from falling objects.",
            "Move away from buildings, street lights, power lines, and anything else that could fall. Seek shelter near a hill or in a wide open area. ",
            "Do not move until it is safe to do so. Slowly and carefully leave the building.",
            "Stop as quickly as safety permits and stay in the vehicle. Avoid stopping near, or under buildings, trees, overpasses, and utility wires."
    };
    public String[] slide_heads = {
            "HOW TO SURVIVE AN EARTHQUAKE",
            "HOW TO SURVIVE AN EARTHQUAKE",
            "HOW TO SURVIVE AN EARTHQUAKE",
            "HOW TO SURVIVE AN EARTHQUAKE",
            "HOW TO SURVIVE AN EARTHQUAKE"
    };
    @Override
    public int getCount() {
        return slide_descs.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout) object;
    }
    public Object instantiateItem(ViewGroup container, int position){

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.earthquake_during_steps, container,false);

        ImageView slideimageview = (ImageView) view.findViewById(R.id.slide_image);
        TextView slidedescription = (TextView) view.findViewById(R.id.slide_desc);
        TextView slidehead = (TextView) view.findViewById(R.id.slide_head);

        slideimageview.setImageResource(slide_images[position]);
        slidedescription.setText(slide_descs[position]);
        slidehead.setText(slide_heads[position]);

        container.addView(view);
        return view;
    };

    @Override
    public void destroyItem(ViewGroup container,int position,Object object){

        container.removeView((RelativeLayout)object);
    }
}
