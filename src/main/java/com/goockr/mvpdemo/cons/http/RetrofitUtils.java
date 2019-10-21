package com.goockr.mvpdemo.cons.http;

import com.goockr.mvpdemo.api.Api;
import com.goockr.mvpdemo.cons.url.Urls;
import com.zhy.http.okhttp.https.HttpsUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author yofreg
 * @time 2019/10/17 10:48
 * @desc
 */
public class RetrofitUtils {

    private static RetrofitUtils install;
    private static Retrofit mRetrofit;
    private static Api api;

    public static RetrofitUtils getInstance() {
        if (install == null) {
            synchronized (RetrofitUtils.class) {
                if (install == null) {
                    install = new RetrofitUtils();
                }
            }
        }
        return install;
    }

    private RetrofitUtils() {
        HttpsUtils.SSLParams sslParams = HttpsUtils.getSslSocketFactory(null, null, null);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager)
                .build();
        //Retrofit2后使用build设计模式
        mRetrofit = new Retrofit.Builder()
                //设置服务器路径
                .baseUrl(Urls.basedataUrl)
                //添加转化库，默认是Gson
                .addConverterFactory(GsonConverterFactory.create())
                //添加回调库，采用RxJava
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                //设置使用okhttp网络请求
                .client(okHttpClient)
                .build();
    }

    public static Api getApi() {
        if (api == null) {
            api = mRetrofit.create(Api.class);
        }
        return api;
    }
}
