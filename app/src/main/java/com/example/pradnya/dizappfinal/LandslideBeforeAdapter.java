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

public class LandslideBeforeAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public LandslideBeforeAdapter(Context context){
        this.context = context;
    }
    //Arrays
    public int[] slide_images = {

            R.drawable.landslide_before_step1,
            R.drawable.landslide_before_step2,
            R.drawable.landslide_before_step3,
            R.drawable.landslide_before_step4,
            R.drawable.landslide_before_step5
    };
    public String[] slide_descs = {
            "Look for new areas of moisture. If you see springs or puddles in areas of the ground that are usually dry, this could be a sign of an imminent landslide.",
            "Look for warping and movement in the surrounding area. Sunken roadbeds and leaning fences, telephone poles, and trees can signal an imminent landslide.",
            "Monitor changing water levels. A sudden increase in creek water levels is a warning sign.",
            "Follow proper land-use procedures. Proper land use-procedures dictate that you should not build near mountain edges, steep slopes, or natural erosion valleys. These areas are prone to landslides.",
            "Understand how to get emergency alerts. Make sure everyone knows how to get emergency alerts from local officials, whether it be via phone, television, or radio."

    };
    public String[] slide_heads = {
            "HOW TO PREPARE FOR LANDSLIDE",
            "HOW TO PREPARE FOR LANDSLIDE",
            "HOW TO PREPARE FOR LANDSLIDE",
            "HOW TO PREPARE FOR LANDSLIDE",
            "HOW TO PREPARE FOR LANDSLIDE"
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
        View view = layoutInflater.inflate(R.layout.flood_before_steps, container,false);

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
