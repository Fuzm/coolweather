package com.coolweather.app.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.coolweather.app.service.AutoUpdateService;

/**
 * Created by Fuzm on 2017/1/16 0016.
 */

public class AutoUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("AutoUpdatReceiver", "auto update weather");
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
