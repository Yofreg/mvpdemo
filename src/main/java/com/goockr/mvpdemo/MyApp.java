package com.goockr.mvpdemo;

import android.app.Application;

import com.goockr.mvpdemo.api.Api;
import com.goockr.mvpdemo.cons.http.RetrofitUtils;

/**
 * @author yofreg
 * @time 2019/10/17 10:37
 * @desc
 */
public class MyApp extends Application {

    public static Api Myapi;

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化
        RetrofitUtils.getInstance();
        Myapi = RetrofitUtils.getApi();
    }
}
