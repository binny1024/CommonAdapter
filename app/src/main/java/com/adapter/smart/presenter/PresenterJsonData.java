package com.adapter.smart.presenter;

import com.adapter.smart.common.CommonAdapter;
import com.adapter.smart.model.IDataResult;
import com.adapter.smart.model.IModelJsonData;
import com.adapter.smart.model.ModelJsonData;
import com.adapter.smart.view.IShowData;

/**
 * Created by smart on 2017/4/27.
 */

/*
* 中间层 负责 任务 路由
* */
public class PresenterJsonData {
    private IShowData mIShowData;//view层接口。成功获取数据后调用
    private IModelJsonData mIModelJsonData;//model层接口。发起业务逻辑，读取数据等

    public PresenterJsonData(IShowData IShowData ) {
        mIShowData = IShowData;
        mIModelJsonData = new ModelJsonData ();
    }

    /*
    * 从本地文档读取数据*/
    public void getJsonLocal(final int tag,String dataSource){

        mIModelJsonData.getLocalDataList(tag,dataSource, new IDataResult() {

            @Override
            public void success( CommonAdapter.BaseBean  baseBean) {
                mIShowData.showList(baseBean);
            }

            @Override
            public void failure(String msg) {
                mIShowData.showError(msg);
            }
        });
    }

    /**
     * @param tag 三种测试的数据类型
     * @param dataSource 数据的url
     */
    public void getJsonNet(final int tag,String dataSource) {
        mIModelJsonData.getNetDataList(tag, dataSource, new IDataResult() {
            @Override
            public void success( CommonAdapter.BaseBean  bean) {
                mIShowData.showList(bean);
            }

            @Override
            public void failure(String msg) {
                mIShowData.showError(msg);
            }
        });
    }
}
