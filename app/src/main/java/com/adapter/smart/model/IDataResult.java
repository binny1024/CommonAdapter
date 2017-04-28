package com.adapter.smart.model;

import com.adapter.smart.common.CommonAdapter;

/**
 * Created by smart on 2017/4/27.
 */

/*
* M层提供给P层的接口，用于反馈业务结果
* */
public interface IDataResult<T extends  CommonAdapter.BaseBean > {
    void success(T bean);
    void failure(String msg);
}
