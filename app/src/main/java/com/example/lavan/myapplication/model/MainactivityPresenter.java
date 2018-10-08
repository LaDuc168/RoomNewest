package com.example.lavan.myapplication.model;

public class MainactivityPresenter {
    private MainactivityContrac.View view;

    public MainactivityPresenter(MainactivityContrac.View view) {
        this.view = view;
    }
    public void showUser(User user){
        view.showData(user);
    }
}
