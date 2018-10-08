package com.example.lavan.myapplication.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Student extends BaseObservable {
    private String address;

    @Bindable
    public String getAddress() {
        return address;
    }
    @Bindable
    public void setAddress(String address) {
        this.address = address;
    }

    public Student() {

    }

    public Student(String address) {

        this.address = address;
    }
}
