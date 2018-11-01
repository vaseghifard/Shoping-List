package com.example.lenovo.shopinglist.utils;

import android.widget.Toast;

public class PublicMethods {
    public static void toast(int msg){
        Toast.makeText(MyApplication.appInstance,msg,Toast.LENGTH_SHORT).show();
    }
}
