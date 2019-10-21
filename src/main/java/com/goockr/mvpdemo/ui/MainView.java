package com.goockr.mvpdemo.ui;

import com.goockr.mvpdemo.base.BaseView;
import com.goockr.mvpdemo.bean.LoginBean;

/**
 * @author yofreg
 * @time 2019/10/17 10:44
 * @desc
 */
public interface MainView extends BaseView {

    void phonePasswordLogInFinished(LoginBean loginBean);
}
