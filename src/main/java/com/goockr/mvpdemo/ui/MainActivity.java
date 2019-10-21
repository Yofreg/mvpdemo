package com.goockr.mvpdemo.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.goockr.mvpdemo.R;
import com.goockr.mvpdemo.base.BaseActivity;
import com.goockr.mvpdemo.bean.LoginBean;
import com.goockr.mvpdemo.presenter.MainPresenterImpl;

import okhttp3.FormBody;
import okhttp3.RequestBody;

public class MainActivity extends BaseActivity<MainPresenterImpl> implements MainView, View.OnClickListener {

    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        btn_send = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(this);
    }

    @Override
    protected void createPresenter() {
        mPresenter = new MainPresenterImpl();
    }

    @Override
    public void showDialog(String msg) {
    }

    @Override
    public void hideDialog() {
    }

    @Override
    public void showError(int id, String msg) {
        Log.v("xxxxxf", msg);
    }

    @Override
    public void phonePasswordLogInFinished(LoginBean loginBean) {
        Log.v("xxxxxf", loginBean.toString());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_send:
                RequestBody body = new FormBody.Builder()
                    .add("phone", "18376476068")
                    .add("password", "666666").build();
                mPresenter.phonePasswordLogInUrl(1, body);
                break;
        }
    }
}
