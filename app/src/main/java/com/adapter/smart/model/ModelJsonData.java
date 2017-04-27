package com.adapter.smart.model;

import android.util.Log;

import com.adapter.smart.bean.BeanMutilObj;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by smart on 2017/4/27.
 */

public class ModelJsonData  implements IModelJsonData  {

    private BeanMutilObj mBeanMutilObj;

    @Override
    public void getLocalDataList(String dataSource, IDataResult iDataResult) {
        Gson gson = new Gson();
        mBeanMutilObj = gson.fromJson(dataSource, new TypeToken<BeanMutilObj>(){}.getType());
        if (mBeanMutilObj.getData() == null) {
            iDataResult.failure("数据为空,请把ConstantUrl 字段改回data");
        }else {
            iDataResult.success(mBeanMutilObj);
        }
    }

    @Override
    public void getNetDataList(String dataSource, final IDataResult iDataResult) {
        OkGo.get(dataSource)     // 请求方式和请求url
                .tag(this)                       // 请求的 tag, 主要用于取消对应的请求
                .cacheKey("cacheKey")            // 设置当前请求的缓存key,建议每个不同功能的请求设置一个
                .cacheMode(CacheMode.DEFAULT)    // 缓存模式，详细请看缓存介绍
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        Log.i("xxx", "onSuccess: "+s);
                        Gson gson = new Gson();
                        mBeanMutilObj = gson.fromJson(s, new TypeToken<BeanMutilObj>(){}.getType());
                        if (mBeanMutilObj == null) {
                            iDataResult.failure("数据为空");
                        }else {
                            iDataResult.success(mBeanMutilObj);
                        }
                    }
                });
    }


}
