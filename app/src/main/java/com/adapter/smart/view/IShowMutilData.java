package com.adapter.smart.view;

import com.adapter.smart.bean.BeanMutilObj;

/**
 * Created by smart on 2017/4/27.
 */

/*
* view层接口
* */
public interface IShowMutilData {
    void showList(BeanMutilObj beanMutilObj);
    void showError(String msg);
}
