package com.adapter.smart.common;
import java.io.Serializable;
import java.util.List;

/**
 * Created by smart on 2017/4/26.
 */

public class CommonBean<T>  implements Serializable {

    private static final long serialVersionUID = 7357105112620477247L;
    protected int status;
    protected String msg;

    protected int getStatus() {
        return status;
    }

    protected void setStatus(int status) {
        this.status = status;
    }

    protected String getMsg() {
        return msg;
    }

    protected void setMsg(String msg) {
        this.msg = msg;
    }
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

}

