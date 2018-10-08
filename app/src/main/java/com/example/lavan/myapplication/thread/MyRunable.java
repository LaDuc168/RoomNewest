package com.example.lavan.myapplication.thread;

public class MyRunable implements Runnable {
    private CreateAsynctask createThread;
    private IView iView;
    public MyRunable(IView iView){
        this.iView=iView;
    }
    @Override
    public void run() {
        createThread=new CreateAsynctask(iView);
        createThread.execute();
    }
}
