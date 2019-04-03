package com.example.pradnya.dizappfinal;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by anish on 16-03-2018.
 */

public class FirebaseID extends FirebaseInstanceIdService {

    private static final String reg_token = "REGISTRATION TOKEN";

    @Override
    public void onTokenRefresh() {
        String recentToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(reg_token, recentToken);
    }
}
