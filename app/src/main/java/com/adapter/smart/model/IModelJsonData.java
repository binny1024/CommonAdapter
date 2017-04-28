package com.adapter.smart.model;

/**
 * Created by smart on 2017/4/27.
 */

public interface IModelJsonData  {

    /*
    * 获取本地数据
    * */
    void getLocalDataList(int tag,String dataSource, IDataResult iDataResult);
    /*
    * 获取网络数据
    * */
    void getNetDataList(int tag,String url,final IDataResult iDataResult);
}
