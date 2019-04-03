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

public class FloodBeforeAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public FloodBeforeAdapter(Context context){
        this.context = context;
    }
    //Arrays
    public int[] slide_images = {

            R.drawable.flood_before_step1,
            R.drawable.flood_before_step2,
            R.drawable.flood_before_step3,
            R.drawable.flood_before_step4,
            R.drawable.flood_before_step5,
            R.drawable.flood_before_step6
    };
    public String[] slide_descs = {
            "Identify where to go during an evacuation. Sit down with your family to establish a plan of action.",
            "Assemble an emergency supplies kit. Ready a kit that includes basic necessities.",
            "Insure your house against flooding. Flood insurance can save you a lot of hassle if your home or business is damaged.",
            "Barricade your home against floodwater. Sealing your basement makes it more resistant to water. Fill in cracks and spread sealant over the walls.",
            "Listen to the news for flood risk warnings.Flooding information can be found on your local news or weather station’s TV channel or website.",
            "Watch known flood areas. Keep an eye on dangerous areas such as drainage channels, canyons, and streams."

    };
    public String[] slide_heads = {
            "HOW TO PREPARE FOR FLOOD",
            "HOW TO PREPARE FOR FLOOD",
            "HOW TO PREPARE FOR FLOOD",
            "HOW TO PREPARE FOR FLOOD",
            "HOW TO PREPARE FOR FLOOD",
            "HOW TO PREPARE FOR FLOOD"
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