package com.goockr.mvpdemo.listener;

/**
 * @author yofreg
 * @time 2019/10/17 10:32
 * @desc
 */
public interface Model2PresenterListener<T> {

    void onSuccess(int id, T mBean);

    void onError(int id, String msg);
}
