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

public class FloodDuringAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public FloodDuringAdapter(Context context){
        this.context = context;
    }
    //Arrays
    public int[] slide_images = {

            R.drawable.flood_during_step1,
            R.drawable.flood_during_step2,
            R.drawable.flood_during_step3,
            R.drawable.flood_during_step4,
            R.drawable.flood_during_step5,
    };
    public String[] slide_descs = {
            "Evacuate dangerous areas immediately. You may have only a short time to escape. Act quickly, utilizing your planned route.",
            "Move to higher ground away from water.. Get away from areas with storm drains, streams, creeks, or rivers. If you’re stuck at home, head for the roof.",
            "Avoid crossing through water. Water up to your ankles is enough to be dangerous. You cannot see how deep the water is the rest of the way.",
            "Stay out of moving water. Moving water is never safe to approach. The current is usually stronger than it appears and even a slight current is strong enough to carry off adults and vehicles",
            "Swim backwards to survive moving water. Turn over on your back instead of fighting the tide.Try to find something to hold onto, such as a strong branch or roof. "
    };
    public String[] slide_heads = {
            "HOW TO SURVIVE A FLOOD",
            "HOW TO SURVIVE A FLOOD",
            "HOW TO SURVIVE A FLOOD",
            "HOW TO SURVIVE A FLOOD",
            "HOW TO SURVIVE A FLOOD"
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
