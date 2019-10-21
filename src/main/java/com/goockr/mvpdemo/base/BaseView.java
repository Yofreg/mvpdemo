package com.goockr.mvpdemo.base;

/**
 * @author yofreg
 * @time 2019/10/17 10:41
 * @desc
 */
public interface BaseView {

    //显示对话框
    void showDialog(String msg);

    //隐藏对话框
    void hideDialog();

    //显示出错信息
    void showError(int id, String msg);

}
