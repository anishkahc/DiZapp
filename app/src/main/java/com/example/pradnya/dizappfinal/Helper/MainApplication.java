package com.example.pradnya.dizappfinal.Helper;

import android.app.Application;
import android.content.Context;

import com.example.pradnya.dizappfinal.Helper.LocalHelper;

/**
 * Created by anish on 17-03-2018.
 */

public class MainApplication extends Application{



    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocalHelper.onAttach(base,"en"));

    }
}
