package com.example.pradnya.dizappfinal;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by anish on 16-03-2018.
 */

public class FirebaseMsgService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intent intent = new Intent(this, SafetyTips.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent, PendingIntent.FLAG_ONE_SHOT);
        NotificationCompat.Builder notifBuilder = new NotificationCompat.Builder(this);
        notifBuilder.setContentTitle("FCM NOTIFICATION");
        notifBuilder.setContentText(remoteMessage.getNotification().getBody());
        notifBuilder.setAutoCancel(true);
        notifBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        notifBuilder.setContentIntent(pendingIntent);
        NotificationManager notifManager =(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notifManager.notify(0,notifBuilder.build());
    }
}
