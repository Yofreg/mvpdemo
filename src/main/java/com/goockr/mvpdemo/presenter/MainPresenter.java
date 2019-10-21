package com.goockr.mvpdemo.presenter;

import com.goockr.mvpdemo.base.BasePresenter;
import com.goockr.mvpdemo.ui.MainView;

import okhttp3.RequestBody;

/**
 * @author yofreg
 * @time 2019/10/17 10:44
 * @desc
 */
public interface MainPresenter extends BasePresenter<MainView> {

    void phonePasswordLogInUrl(int id, RequestBody body);
}
