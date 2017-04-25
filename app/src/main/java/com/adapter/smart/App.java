package com.adapter.smart;

import android.app.Application;

import com.lzy.okgo.OkGo;

/**
 * Created by smart on 2017/4/24.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //必须调用初始化
        OkGo.init(this);
    }
}
