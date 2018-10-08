package com.example.lavan.myapplication.room.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.lavan.myapplication.room.model.Book;

@Database(entities = {Book.class,NguoiDung.class},version = 4)
public abstract class MyRoomDB extends RoomDatabase {
    public abstract DaoBook getDaoBook();
    public abstract DaoNguoiDung getDaoND();
    private static MyRoomDB instance;
    public synchronized static MyRoomDB getInstance(Context context){
        if(instance==null){
           instance= Room.databaseBuilder(context.getApplicationContext(), MyRoomDB.class, "myDB")
                   .allowMainThreadQueries()
                   .fallbackToDestructiveMigration()
                   .build();
        }
        return instance;
    }
}
