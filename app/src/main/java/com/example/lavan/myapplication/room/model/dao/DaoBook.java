package com.example.lavan.myapplication.room.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.lavan.myapplication.room.model.Book;

import java.util.List;

@Dao
public interface DaoBook {
    @Query("select * from book")
    public List<Book> getAllBook();
    @Insert
    void insertBook(Book book);
    @Update
    void updateBook(Book book);
    @Delete
    void deleteBook(Book book);
    @Query("delete from book")
    void deleteAllBook();
}
