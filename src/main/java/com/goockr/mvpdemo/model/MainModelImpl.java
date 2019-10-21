package com.goockr.mvpdemo.model;

import com.goockr.mvpdemo.MyApp;
import com.goockr.mvpdemo.cons.http.ModelUtils;
import com.goockr.mvpdemo.listener.Model2PresenterListener;

import okhttp3.RequestBody;

/**
 * @author yofreg
 * @time 2019/10/17 10:45
 * @desc
 */
public class MainModelImpl implements MainModel {

    @Override
    public void phonePasswordLogInUrl(final int id, RequestBody body, final Model2PresenterListener listener) {
        ModelUtils.ApiSubscribe(MyApp.Myapi.phonePasswordLogIn(body), new ModelUtils.ModelUtilsListener() {
            @Override
            public <T> void onSuccess(T t) {
                listener.onSuccess(id, t);
            }

            @Override
            public void onError(String msg) {
                listener.onError(id, "phonePasswordLogInUrlError:" + msg);
            }
        });
    }
}
