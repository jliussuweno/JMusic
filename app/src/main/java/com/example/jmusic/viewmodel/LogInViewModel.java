package com.example.jmusic.viewmodel;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.jmusic.database.UserDao;
import com.example.jmusic.database.UserRoomDatabase;

public class LogInViewModel extends AndroidViewModel {

    Context context;
    UserRoomDatabase userRoomDatabase;
    UserDao userDao;

    public LogInViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
        userRoomDatabase = UserRoomDatabase.getInstance(context);
        userDao = userRoomDatabase.userDao();
    }

    public int checkLogin(String email, String password){
        return userDao.selectUserLogin(email, password);
    }
}
