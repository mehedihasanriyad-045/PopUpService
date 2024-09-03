package com.example.backgroundserviceapp.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.backgroundserviceapp.service.NotificationService;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Log.d("BootReceiver", "Device booted. Starting the service.");
            Intent serviceIntent = new Intent(context, NotificationService.class);
            context.startService(serviceIntent);
        }
    }
}
