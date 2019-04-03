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

public class LandslideAfterAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public LandslideAfterAdapter(Context context){
        this.context = context;
    }
    //Arrays
    public int[] slide_images = {

            R.drawable.landslide_after_step1,
            R.drawable.landslide_after_step2,
            R.drawable.landslide_after_step3,
            R.drawable.landslide_after_step4,
            R.drawable.landslide_after_step5,
    };
    public String[] slide_descs = {
            "Avoid the area where the landslide occurred. Landslides may recur in the same location. Avoid this area and seek shelter ",
            "Check for trapped and injured people. If you can see people who are trapped or injured in the area, notify the authorities immediately.",
            "Go to a public shelter. Go to the shelter if your home is unsafe or the authorities have called for an evacuation.",
            "Assess the area for damage and safety. Report any damaged utility lines, roadways, and railways to the authorities.",
            "Replant the affected area. Landslides often destroy vegetation. Replanting the affected area helps prevent future landslides."

    };
    public String[] slide_heads = {
            "AFTER A LANDSLIDE",
            "AFTER A LANDSLIDE",
            "AFTER A LANDSLIDE",
            "AFTER A LANDSLIDE",
            "AFTER A LANDSLIDE"
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
