package com.example.lavan.myapplication.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

public class User extends BaseObservable {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {

        this.name = name;
        this.password = password;
    }

    @Bindable
    public String getName() {
        return name;
    }
    @Bindable
    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public String getPassword() {
        return password;
    }
    @Bindable
    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }
}
