package com.example.lavan.myapplication;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;

import java.util.ArrayList;
import java.util.List;

public class Demo extends ViewModel {
    private static Demo instance = null;

    public static synchronized Demo getInstance(Context context) {
        if (instance == null) {
            instance = ViewModelProviders.of((FragmentActivity) context).get(Demo.class);
        }
        return instance;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LiveData<List<String>> getAll(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add("item " + i);
        }
        return (LiveData<List<String>>) list;
    }
}
