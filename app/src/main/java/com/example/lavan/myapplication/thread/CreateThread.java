package com.example.lavan.myapplication.thread;

public class CreateThread extends Thread {
    private CreateAsynctask createThread;
    private IView iView;
    public CreateThread(IView iView){
        this.iView=iView;
    }
    @Override
    public void run() {
        super.run();
        createThread=new CreateAsynctask(iView);
        createThread.execute();
    }
}
