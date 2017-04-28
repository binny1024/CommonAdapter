package com.adapter.smart.model;

import android.util.Log;

import com.adapter.smart.bean.BeanMutilObj;
import com.adapter.smart.bean.BeanNoObj;
import com.adapter.smart.bean.BeanOneObj;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

import static com.adapter.smart.constants.DataType.DATA_TYPE_MUTIL;
import static com.adapter.smart.constants.DataType.DATA_TYPE_NO;
import static com.adapter.smart.constants.DataType.DATA_TYPE_ONE;

/**
 * Created by smart on 2017/4/27.
 */

public class ModelJsonData  implements IModelJsonData  {

    private BeanMutilObj mBeanMutilObj;//含有数组的json
    private BeanOneObj mBeanOneObj;//含有一个对象的json
    private BeanNoObj mBeanNoObj;//没有对象的json

    @Override
    public void getLocalDataList(int tag,String s, IDataResult iDataResult) {
        switch (tag) {
            case DATA_TYPE_NO:
                resultNo(s,iDataResult);
                break;
            case DATA_TYPE_ONE:
                resultOne(s,iDataResult);
                break;
            case DATA_TYPE_MUTIL:
                resultMutil(s,iDataResult);
                break;
        }
    }

    @Override
    public void getNetDataList(final int tag, String url, final IDataResult iDataResult) {
        OkGo.get(url)     // 请求方式和请求url
                .tag(this)                       // 请求的 tag, 主要用于取消对应的请求
                .cacheKey("cacheKey")            // 设置当前请求的缓存key,建议每个不同功能的请求设置一个
                .cacheMode(CacheMode.DEFAULT)    // 缓存模式，详细请看缓存介绍
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        switch (tag){
                            case DATA_TYPE_NO:
                                resultNo(s,iDataResult);
                                break;
                            case DATA_TYPE_ONE:
                                resultOne(s,iDataResult);
                                break;
                            case DATA_TYPE_MUTIL:
                                resultMutil(s,iDataResult);
                                break;
                        }

                    }
                });
    }

    private void resultMutil(String s, final IDataResult iDataResult) {
        Gson gson = new Gson();
        mBeanMutilObj = gson.fromJson(s, new TypeToken<BeanMutilObj>(){}.getType());
        if (mBeanMutilObj == null) {
            iDataResult.failure("数据为空");
        }else {
            iDataResult.success(mBeanMutilObj);
        }
    }
    private void resultOne(String s, final IDataResult iDataResult) {
        Gson gson = new Gson();
        mBeanOneObj = gson.fromJson(s, new TypeToken<BeanOneObj>(){}.getType());
        if (mBeanOneObj == null) {
            iDataResult.failure("数据为空");
        }else {
            iDataResult.success(mBeanOneObj);
        }
    }
    private void resultNo(String s, final IDataResult iDataResult) {
        Log.i("xxx", "resultNo: "+s);
        Gson gson = new Gson();
        mBeanNoObj = gson.fromJson(s, new TypeToken<BeanNoObj>(){}.getType());
        if (mBeanNoObj == null) {
            iDataResult.failure("数据为空");
        }else {
            iDataResult.success(mBeanNoObj);
        }
    }


}
