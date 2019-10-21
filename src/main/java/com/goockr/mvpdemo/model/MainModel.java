package com.goockr.mvpdemo.model;

import com.goockr.mvpdemo.listener.Model2PresenterListener;

import okhttp3.RequestBody;

/**
 * @author yofreg
 * @time 2019/10/17 10:45
 * @desc
 */
public interface MainModel {
    
    void phonePasswordLogInUrl(int id, RequestBody body, Model2PresenterListener listener);

}
