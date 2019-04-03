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

public class EarthquakeBeforeAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public EarthquakeBeforeAdapter(Context context){
        this.context = context;
    }
    //Arrays
    public int[] slide_images = {

            R.drawable.earth_before_step1,
            R.drawable.earth_before_step2,
            R.drawable.earth_before_step3,
            R.drawable.earth_before_step4,
            R.drawable.earth_before_step5
    };
    public String[] slide_descs = {
            "Have emergency supplies stockpiled. In the event of an emergency, many services like electricity and water that are often taken for granted may become unavailable.",
            "Have a survival plan for your home.You should know the 'safe' spots in your house - under sturdy tables and against interior walls.",
            "Learn first aid and CPR. Take a basic first-aid course. If someone is hurt in an earthquake, basic knowledge of first aid can be a life-saver. ",
            "Learn how to shut off the water, the electricity and the gas.Earthquakes can sever a house's pipes and/or damage electrical lines, creating situations that can easily become deadly.",
            "Keep dangerous objects in a secure cabinet or on lower shelves. To minimize the risk of injury or damage in any event."

    };
    public String[] slide_heads = {
            "HOW TO PREPARE FOR EARTHQUAKE",
            "HOW TO PREPARE FOR EARTHQUAKE",
            "HOW TO PREPARE FOR EARTHQUAKE",
            "HOW TO PREPARE FOR EARTHQUAKE",
            "HOW TO PREPARE FOR EARTHQUAKE"
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
        View view = layoutInflater.inflate(R.layout.earthquake_before_steps, container,false);

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
