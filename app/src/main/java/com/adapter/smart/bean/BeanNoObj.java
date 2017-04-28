package com.adapter.smart.bean;

import com.adapter.smart.common.CommonAdapter;

/**
 * Created by smart on 2017/4/26.
 */

public class BeanNoObj implements  CommonAdapter.BaseBean  {
    /**
     * status : 1
     * name : Tony老师聊shell——环境变量配置文件
     * age : 12312
     * msg : 成功
     */

    private int status;
    private String name;
    private int age;
    private String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
