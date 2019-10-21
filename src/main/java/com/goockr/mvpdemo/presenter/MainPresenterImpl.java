package com.goockr.mvpdemo.presenter;

import com.goockr.mvpdemo.bean.LoginBean;
import com.goockr.mvpdemo.listener.Model2PresenterListener;
import com.goockr.mvpdemo.model.MainModel;
import com.goockr.mvpdemo.model.MainModelImpl;
import com.goockr.mvpdemo.ui.MainView;

import okhttp3.RequestBody;

/**
 * @author yofreg
 * @time 2019/10/17 10:45
 * @desc
 */
public class MainPresenterImpl implements MainPresenter, Model2PresenterListener {

    private MainModel mModel;
    private MainView mView;

    public MainPresenterImpl() {
        mModel = new MainModelImpl();
    }

    @Override
    public void attachView(MainView view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    @Override
    public void phonePasswordLogInUrl(int id, RequestBody body) {
        if (mView != null) {
            mModel.phonePasswordLogInUrl(id, body, this);
        }
    }

    @Override
    public void onSuccess(int id, Object mBean) {
        if (mView != null) {
            switch (id) {
                case 1:
                    mView.phonePasswordLogInFinished((LoginBean) mBean);
                    break;
            }
        }
    }

    @Override
    public void onError(int id, String msg) {
        if (mView != null) {
            switch (id) {
                case 1:
                    mView.showError(id, msg);
                    break;
            }
        }
    }
}
