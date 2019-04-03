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

public class FloodAfterAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public FloodAfterAdapter(Context context){
        this.context = context;
    }
    //Arrays
    public int[] slide_images = {

            R.drawable.flood_after_step1,
            R.drawable.flood_after_step2,
            R.drawable.flood_after_step3,
            R.drawable.flood_after_step4,
            R.drawable.flood_after_step5,
            R.drawable.flood_after_step6
    };
    public String[] slide_descs = {
            "Watch out for damaged areas. Roads and other paths will have been eroded.Stay off of bridges.Find alternate routes over high ground or wait for the authorities to indicate which roads are safe.",
            "Avoid downed electrical lines and flooded areas. Assume any downed power lines or electrical wires are live. Don’t approach them. Assume any floodwater you see is also dangerous.",
            "Turn off all electrical and gas lines. Your home may have suffered structural damage, including wet electrical wires and gas leaks.Don’t depend on standard power sources.",
            "Use a stick to check for snakes. Dangerous animals may have washed into your home or taken shelter there. ",
            "Make repairs to your home. Your house may be unsafe to occupy. A sump pump, wet-dry shop vacuum, or water pump will remove standing water. Have a professional check your home for structural damage.",
            "Clean your home. Mud and water that washed into your home can contain sewage and dangerous chemicals.Open up all the door and windows"

    };
    public String[] slide_heads = {
            "RETURNING HOME AFTER A FLOOD",
            "RETURNING HOME AFTER A FLOOD",
            "RETURNING HOME AFTER A FLOOD",
            "RETURNING HOME AFTER A FLOOD",
            "RETURNING HOME AFTER A FLOOD",
            "RETURNING HOME AFTER A FLOOD"
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
