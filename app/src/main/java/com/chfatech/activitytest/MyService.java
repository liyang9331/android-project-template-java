package com.chfatech.activitytest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public void onCreate(){
        super.onCreate();
        Log.d("MyService", "onCreate: executed");
    }

    @Override
    public int onStartCommand(Intent intent,int flags,int startId){
        Log.d("MyService", "onStartCommand: executed");
        return super.onStartCommand(intent,flags,startId);

    }
    @Override
    public void onDestroy(){
        Log.d("MyService", "onDestroy: executed");
        super.onDestroy();

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}