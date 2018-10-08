package com.example.lavan.myapplication;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lavan.myapplication.databinding.ActivityMainBinding;
import com.example.lavan.myapplication.model.MainactivityContrac;
import com.example.lavan.myapplication.model.MainactivityPresenter;
import com.example.lavan.myapplication.model.SinhVien;
import com.example.lavan.myapplication.model.Student;
import com.example.lavan.myapplication.model.User;
import com.example.lavan.myapplication.test.HienThucKetQua;
import com.example.lavan.myapplication.test.IKetQua;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IKetQua {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user=new User("Lavanduc","123");
        activityMainBinding.setUser(user);
        SinhVien sv=new SinhVien("SV0123","Le thi nga");
        activityMainBinding.setSinhvien(sv);

        HienThucKetQua hienThucKetQua=new HienThucKetQua(this);
        activityMainBinding.setKetqua(hienThucKetQua);
        Student student=new Student("Ha noi");
        activityMainBinding.setStudent(student);

    }



    @Override
    public void success(String name) {
        Toast.makeText(this, "success="+name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void error(String name) {
        Toast.makeText(this, "error="+name, Toast.LENGTH_SHORT).show();

    }
}
