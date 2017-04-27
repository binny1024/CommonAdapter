package com.adapter.smart.model;

/**
 * Created by smart on 2017/4/27.
 */

public interface IModelJsonData  {

    /*
    * 获取本地数据
    * */
    void getLocalDataList( String dataSource, IDataResult iDataResult);
    /*
    * 获取网络数据
    * */
    void getNetDataList(String dataSource,IDataResult iDataResult);
}
