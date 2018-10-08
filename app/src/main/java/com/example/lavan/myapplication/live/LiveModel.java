package com.example.lavan.myapplication.live;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class LiveModel extends ViewModel {
    MutableLiveData<Integer> mutableLiveData=new MutableLiveData<>();
    public void setData(Integer integer){
        mutableLiveData.setValue(integer);
    }
    public MutableLiveData<Integer> getData(){
        return mutableLiveData;
    }
}
