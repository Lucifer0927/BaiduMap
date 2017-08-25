package com.bwie.mymap;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * author: 钟文亮
 * data: 2017/8/24.
 * desc:
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
    }
}
