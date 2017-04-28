package com.adapter.smart.view;

import com.adapter.smart.common.CommonAdapter;

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
