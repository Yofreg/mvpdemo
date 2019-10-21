package com.goockr.mvpdemo.base;

/**
 * @author yofreg
 * @time 2019/10/17 10:43
 * @desc
 */
public interface BasePresenter<T extends BaseView> {

    //绑定view
    void attachView(T view);

    //解除绑定
    void detachView();
}
