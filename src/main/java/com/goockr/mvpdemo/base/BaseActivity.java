package com.goockr.mvpdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * @author yofreg
 * @time 2019/10/17 10:40
 * @desc
 */
public abstract class BaseActivity<T extends BasePresenter> extends FragmentActivity implements BaseView {

    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    protected abstract void createPresenter();
}
