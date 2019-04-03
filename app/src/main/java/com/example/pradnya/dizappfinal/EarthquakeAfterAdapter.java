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

public class EarthquakeAfterAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public EarthquakeAfterAdapter(Context context){
        this.context = context;
    }
    //Arrays
    public int[] slide_images = {

            R.drawable.earth_after_step1,
            R.drawable.earth_after_step2,
            R.drawable.earth_after_step3,
            R.drawable.earth_after_step4
    };
    public String[] slide_descs = {
            "Inspect your house for anything that might be in a dangerous condition. Glass fragments, the smell of gas, or damaged electrical appliances are can cause hazards. ",
            "Check for damage around your building.Check for gas leaks.Check for sewage and water line damage.Look for electrical system damage.",
            "Open your cabinets cautiously. Items inside may fall on you if you open the doors quickly. ",
            "Proceed cautiously once the earthquake has stopped. Avoid roads, bridges, or ramps that might have been damaged by the earthquake. "
    };
    public String[] slide_heads = {
            "AFTER AN EARTHQUAKE",
            "AFTER AN EARTHQUAKE",
            "AFTER AN EARTHQUAKE",
            "AFTER AN EARTHQUAKE"
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
        View view = layoutInflater.inflate(R.layout.earthquake_after_steps, container,false);

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
