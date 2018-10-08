package com.example.lavan.myapplication.model;

public interface MainactivityContrac {
    public interface Presenter {
        void onShowData(User user);
    }

    public interface View {
        void showData(User user);
    }
}
