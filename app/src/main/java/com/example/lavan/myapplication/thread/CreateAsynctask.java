package com.example.lavan.myapplication.thread;

import android.os.AsyncTask;

public class CreateAsynctask extends AsyncTask<Void,Void,Integer> {
    private IView iView;

    public CreateAsynctask(IView iView) {
        this.iView = iView;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        iView.updateUi(0);
    }

    @Override
    protected Integer doInBackground(Void... voids) {
        int i;
        for (i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
        iView.updateUi(integer);

    }
}
