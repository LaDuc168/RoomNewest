package com.example.lavan.myapplication.room.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "book")
public class Book {
    @PrimaryKey(autoGenerate = true)
    private int ma;
    private String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(int ma, String name) {
        this.ma = ma;
        this.name = name;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
