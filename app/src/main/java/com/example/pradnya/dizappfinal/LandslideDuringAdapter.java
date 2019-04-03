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

public class LandslideDuringAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public LandslideDuringAdapter(Context context){
        this.context = context;
    }
    //Arrays
    public int[] slide_images = {

            R.drawable.landslide_during_step1,
            R.drawable.landslide_during_step2,
            R.drawable.landslide_during_step3,
            R.drawable.landslide_during_step4,
            R.drawable.landslide_during_step5,
            R.drawable.landslide_during_step6
    };
    public String[] slide_descs = {
            "Keep yourself alert and awake. Landslides can occur quite suddenly, so you need to be ready to take action at a moment’s notice.",
            "Evacuate if it is safe to do so. If you think a landslide is imminent and it is safe to leave, evacuate immediately.Contact your neighbors and your local police.",
            "Move to a second storey, if possible. If it isn’t safe to leave the building, but you believe a landslide is imminent, move to the building’s second story, if possible.",
            "Move out of the path of the landslide as quickly as you can. Landslides move very quickly--much faster than you can run or walk.",
            "Curl into a ball if you cannot escape. If you are trapped in the path of a landslide, curl up into a tight ball and protect your head.",
            "Be cautious and alert while driving. If you need to drive to leave a dangerous area, proceed with caution. DO NOT cross flooded streams."

    };
    public String[] slide_heads = {
            "HOW TO SURVIVE A LANDSLIDE",
            "HOW TO SURVIVE A LANDSLIDE",
            "HOW TO SURVIVE A LANDSLIDE",
            "HOW TO SURVIVE A LANDSLIDE",
            "HOW TO SURVIVE A LANDSLIDE",
            "HOW TO SURVIVE A LANDSLIDE"
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
