package com.example.lavan.myapplication.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class SinhVien extends BaseObservable {
    private String ma;
    private String name;

    @Bindable
    public String getMa() {
        return ma;
    }
    @Bindable
    public void setMa(String ma) {
        this.ma = ma;
    }
    @Bindable
    public String getName() {
        return name;
    }
    @Bindable
    public void setName(String name) {
        this.name = name;
    }

    public SinhVien() {

    }

    public SinhVien(String ma, String name) {

        this.ma = ma;
        this.name = name;
    }
}
