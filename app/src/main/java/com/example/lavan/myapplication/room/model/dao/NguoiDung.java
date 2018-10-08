package com.example.lavan.myapplication.room.model.dao;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import com.example.lavan.myapplication.model.User;
import com.example.lavan.myapplication.room.model.Book;

@Entity(foreignKeys = @ForeignKey(entity = Book.class,
        parentColumns = "ma",
        childColumns = "mabook"))
public class NguoiDung {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String address;
    private int mabook;

    public int getMabook() {
        return mabook;
    }

    public void setMabook(int mabook) {
        this.mabook = mabook;
    }

    public NguoiDung(String address, int mabook) {

        this.address = address;
        this.mabook = mabook;
    }

    public NguoiDung(int id, String address, int mabook) {

        this.id = id;
        this.address = address;
        this.mabook = mabook;
    }

    public int getId() {
        return id;
    }

    public NguoiDung(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public NguoiDung() {

    }

    public NguoiDung(int id, String address) {

        this.id = id;
        this.address = address;
    }
}
