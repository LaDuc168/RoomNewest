package com.example.lavan.myapplication.room.model;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;

import com.example.lavan.myapplication.room.model.dao.DaoBook;
import com.example.lavan.myapplication.room.model.dao.DaoNguoiDung;
import com.example.lavan.myapplication.room.model.dao.MyRoomDB;
import com.example.lavan.myapplication.room.model.dao.NguoiDung;

import java.util.List;

public class Presenter extends ViewModel implements DaoBook, DaoNguoiDung {
    private static MyRoomDB myRoomDB;
    private static Presenter presenter;

    public static synchronized Presenter getInstance(Context context) {
        if (presenter == null) {
            myRoomDB = MyRoomDB.getInstance(context);
            presenter = ViewModelProviders
                    .of((FragmentActivity) context)
                    .get(Presenter.class);
        }
        return presenter;
    }

    @Override
    public List<Book> getAllBook() {
        return myRoomDB.getDaoBook().getAllBook();
    }

    @Override
    public void insertBook(Book book) {
        myRoomDB.getDaoBook().insertBook(book);
    }

    @Override
    public void updateBook(Book book) {
        myRoomDB.getDaoBook().updateBook(book);
    }

    @Override
    public void deleteBook(Book book) {
        myRoomDB.getDaoBook().deleteBook(book);
    }

    @Override
    public void deleteAllBook() {
        myRoomDB.getDaoBook().deleteAllBook();
    }

    @Override
    public List<NguoiDung> getAllND() {
        return myRoomDB.getDaoND().getAllND();
    }

    @Override
    public void insertND(NguoiDung book) {
        myRoomDB.getDaoND().insertND(book);
    }

    @Override
    public void updateND(NguoiDung book) {
        myRoomDB.getDaoND().updateND(book);
    }

    @Override
    public void deleteND(NguoiDung book) {
        myRoomDB.getDaoND().deleteND(book);
    }

    @Override
    public void deleteAllND() {
        myRoomDB.getDaoND().deleteAllND();
    }
}
