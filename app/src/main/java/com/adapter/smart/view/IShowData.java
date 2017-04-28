package com.adapter.smart.view;

import java.io.Serializable;

/**
 * Created by smart on 2017/4/27.
 */

/*
* view层接口
* */
public interface IShowData<T extends Serializable> {
    void showList(T bean);
    void showError(String msg);
}
