package com.adapter.smart.presenter;

import com.adapter.smart.bean.BeanMutilObj;
import com.adapter.smart.common.BaseBean;
import com.adapter.smart.model.IDataResult;
import com.adapter.smart.model.IModelJsonData;
import com.adapter.smart.model.ModelJsonData;
import com.adapter.smart.view.IShowMutilData;

/**
 * Created by smart on 2017/4/27.
 */

/*
* 中间层 负责 任务 路由
* */
public class PresenterJsonData {
    private IShowMutilData mIShowData;//view层接口。成功获取数据后调用
    private IModelJsonData mIModelJsonData;//model层接口。发起业务逻辑，读取数据等

    public PresenterJsonData(IShowMutilData IShowData ) {
        mIShowData = IShowData;
        mIModelJsonData = new ModelJsonData ();
    }

    public void getJsonLocal(String dataSource){

        mIModelJsonData.getLocalDataList(dataSource, new IDataResult() {

            @Override
            public void success(BaseBean baseBean) {
                mIShowData.showList((BeanMutilObj) baseBean);
            }

            @Override
            public void failure(String msg) {
                mIShowData.showError(msg);
            }
        });
    }
    public void getJsonNet(String dataSource){

        mIModelJsonData.getNetDataList(dataSource, new IDataResult() {

            @Override
            public void success(BaseBean baseBean) {
                mIShowData.showList((BeanMutilObj) baseBean);
            }

            @Override
            public void failure(String msg) {
                mIShowData.showError(msg);
            }
        });
    }

}
