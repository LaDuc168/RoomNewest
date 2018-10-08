package com.example.lavan.myapplication.test;

public class HienThucKetQua {
    private IKetQua iKetQua;

    public HienThucKetQua(IKetQua iKetQua) {
        this.iKetQua = iKetQua;
    }
    public void success(String name){
        iKetQua.success(name);
    }
    public  void error(String name){
        iKetQua.error(name);
    }
}
