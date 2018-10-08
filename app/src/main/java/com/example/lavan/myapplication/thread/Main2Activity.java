package com.example.lavan.myapplication.thread;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lavan.myapplication.R;
import com.example.lavan.myapplication.live.LiveModel;
import com.example.lavan.myapplication.live.MyObserver;
import com.example.lavan.myapplication.room.model.Book;
import com.example.lavan.myapplication.room.model.Presenter;
import com.example.lavan.myapplication.room.model.dao.MyRoomDB;
import com.example.lavan.myapplication.room.model.dao.NguoiDung;
import com.example.lavan.myapplication.service.MyBroadCast;
import com.example.lavan.myapplication.service.MyIntentService;

import java.util.List;

public class Main2Activity extends AppCompatActivity implements
        View.OnClickListener,
        IUpdateUI,
        LifecycleOwner,
        IView {

    private Button btnsend;
    private MyThread myThread;
    private int index = 0;
    private LiveModel liveModel;
    private MyAsyncTask myAsyncTask;
    private MyBroadCast myBroadCast;
    private MyRoomDB roomDB;
    private Button btnadd, btngetall, btndelete;
    private TextView txtresult;

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
       presenter=Presenter.getInstance(Main2Activity.this);

//        myBroadCast=new MyBroadCast();
//        IntentFilter intentFilter=new IntentFilter();
//        intentFilter.addAction("duc.com.vn");
//        registerReceiver(myBroadCast,intentFilter);
//        myAsyncTask = new MyAsyncTask();
//        myAsyncTask.execute();

    }

    private void init() {
        btnsend = findViewById(R.id.btnsend);
        btnadd = findViewById(R.id.btnadd);
        btngetall = findViewById(R.id.btngetall);
        btndelete = findViewById(R.id.btndelete);
        txtresult=findViewById(R.id.txtresult);
        btnsend.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btngetall.setOnClickListener(this);
        btndelete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnsend:
                Intent intent = new Intent(Main2Activity.this, MyIntentService.class);
                intent.putExtra("VALUE", 5);
                startService(intent);


                break;
            case R.id.btnadd:
                index++;
                presenter.insertBook(new Book("Name " + index));
                presenter.insertND(new NguoiDung("Ha Noi "+index,index));
                break;
            case R.id.btngetall:
                List<NguoiDung> allBook = presenter.getAllND();
                txtresult.setText("");
                for(NguoiDung book:allBook){
                    txtresult.append("MaND: "+book.getId()+"Ma: "+book.getAddress()+"->mabook: "+book.getMabook()+"\n");
                }

                break;
            case R.id.btndelete:

                presenter.deleteAllBook();
                break;
        }
    }

    @Override
    public void updateUI(int number) {
        btnsend.setText(String.valueOf(number));
    }

    @Override
    public void updateUi(int integer) {
        btnsend.setText("done=" + integer);
    }

    public class MyAsyncTask extends AsyncTask<Void, Void, Integer> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            btnsend.setText("loading...");
        }

        @Override
        protected Integer doInBackground(Void... voids) {
            int i;
            for (i = 0; i < 100; i++) {
                Log.d("DUC", String.valueOf(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (isCancelled()) {
                    break;
                }

            }
            return i;
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            btnsend.setText("done=" + integer);
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
        }
    }
}
