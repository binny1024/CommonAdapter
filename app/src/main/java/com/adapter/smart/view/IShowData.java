package com.adapter.smart.view;


import com.smart.holder_library.CommonAdapter;

/**
 * Created by smart on 2017/4/27.
 */

/*
* view层接口
* */
public interface IShowData<T extends  CommonAdapter.BaseBean > {
    void showList(T bean);
    void showError(String msg);
}
