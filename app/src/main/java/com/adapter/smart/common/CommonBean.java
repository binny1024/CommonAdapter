package com.adapter.smart.common;
import java.io.Serializable;
import java.util.List;

/**
 * Created by smart on 2017/4/26.
 */

public class CommonBean<T>  implements Serializable {

    private static final long serialVersionUID = 7357105112620477247L;
    public int status;
    public String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    private List<T> data;

    public List<T> getDataList() {
        return data;
    }

    public void setDataList(List<T> data) {
        this.data = data;
    }

}

