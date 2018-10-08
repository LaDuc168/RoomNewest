package com.example.lavan.myapplication.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.lavan.myapplication.thread.IView;

public class MyIntentService extends IntentService {




    public MyIntentService() {
        super("");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        int value = intent.getIntExtra("VALUE", 0);
        for (int i = 0; i < value; i++) {
            Log.d("DUC", String.valueOf(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Intent intent1=new Intent();
        intent1.setAction("duc.com.vn");
        sendBroadcast(intent1);
    }
}
