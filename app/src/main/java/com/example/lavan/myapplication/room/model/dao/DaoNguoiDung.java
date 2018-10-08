package com.example.lavan.myapplication.room.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.lavan.myapplication.room.model.Book;

import java.util.List;

@Dao
public interface DaoNguoiDung {
    @Query("select * from nguoidung")
    public List<NguoiDung> getAllND();
    @Insert
    void insertND(NguoiDung book);
    @Update
    void updateND(NguoiDung book);
    @Delete
    void deleteND(NguoiDung book);
    @Query("delete from nguoidung")
    void deleteAllND();
}
