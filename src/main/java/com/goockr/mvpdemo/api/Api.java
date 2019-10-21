package com.goockr.mvpdemo.api;

import com.goockr.mvpdemo.bean.LoginBean;
import com.goockr.mvpdemo.cons.url.Urls;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @author yofreg
 * @time 2019/10/17 10:46
 * @desc
 */
public interface Api {

    /**
     *  手机密码登录
     *  参数: phone: 手机号 password: 密码
     */
    @POST(Urls.phonePasswordLogInUrl)
    Observable<LoginBean> phonePasswordLogIn(@Body RequestBody body);
}
