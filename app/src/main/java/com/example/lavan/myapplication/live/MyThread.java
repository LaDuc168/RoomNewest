package com.example.lavan.myapplication.live;

import com.example.lavan.myapplication.thread.Main2Activity;

public class MyThread extends Thread {
    private Main2Activity.MyAsyncTask myAsyncTask;
    @Override
    public void run() {
        super.run();
        myAsyncTask=new Main2Activity().new MyAsyncTask();
        myAsyncTask.execute();

    }
}
