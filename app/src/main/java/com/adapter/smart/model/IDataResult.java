package com.adapter.smart.model;

import com.adapter.smart.common.BaseBean;

/**
 * Created by smart on 2017/4/27.
 */

public interface IDataResult {
    void success(BaseBean baseBean);
    void failure(String msg);
}
