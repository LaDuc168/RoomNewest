package com.example.lavan.myapplication.thread;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public class MyThread extends Thread {
    public Handler handler;
    private IUpdateUI iUpdateUI;
    public MyThread(IUpdateUI iUpdateUI){
        this.iUpdateUI=iUpdateUI;
    }

    @Override
    public void run() {
        super.run();
        Looper.prepare();
        handler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (msg != null) {
                    int d = msg.arg1;
//                    Log.d("DUC", String.valueOf(d));
                    iUpdateUI.updateUI(d);
                }

            }
        };
        Looper.loop();

    }
}
