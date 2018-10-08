package com.example.lavan.myapplication.live;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class MyObserver implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void connectListener(){

        Log.d("DUC","connectListener");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void disconnectListener(){
        Log.d("DUC","disconnectListener");
    }

}
