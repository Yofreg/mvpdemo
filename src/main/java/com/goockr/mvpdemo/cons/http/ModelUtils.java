package com.goockr.mvpdemo.cons.http;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DefaultObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * @author yofreg
 * @time 2019/10/17 10:48
 * @desc
 */
public class ModelUtils {

    public static <T> void ApiSubscribe(Observable<T> observable, final ModelUtilsListener listener) {
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DefaultObserver<T>() {
                    @Override
                    public void onNext(T t) {
                        listener.onSuccess(t);
                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onError( e.getMessage() + ":" + e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public interface ModelUtilsListener {

        /**
         *  请求成功回复
         * @param t 实体类
         * @param <T>
         */
        <T>void onSuccess(T t);

        /**
         *  请求失败回复
         * @param msg 消息
         */
        void onError(String msg);
    }
}
