package com.adapter.smart.model;

import com.adapter.smart.common.BaseBean;

/**
 * Created by smart on 2017/4/27.
 */

/*
* 提供给P层的接口，用于反馈业务结果
* */
public interface IDataResult<T extends BaseBean> {
    void success(T bean);
    void failure(String msg);
}
