package com.adapter.smart.bean;

import com.adapter.smart.common.BaseBean;

/**
 * Created by smart on 2017/4/26.
 */

public class BeanOneObj implements BaseBean {

    /**
     * status : 1
     * data : {"name":"Tony老师聊shell\u2014\u2014环境变量配置文件","age":12312}
     * msg : 成功
     */

    private int status;
    private DataBean data;
    private String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * name : Tony老师聊shell——环境变量配置文件
         * age : 12312
         */

        private String name;
        private int age;

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
    }
}
