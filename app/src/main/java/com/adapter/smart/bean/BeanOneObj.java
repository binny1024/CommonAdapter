package com.adapter.smart.bean;

import com.adapter.smart.common.CommonBean;
import com.google.gson.annotations.SerializedName;

/**
 * Created by smart on 2017/4/26.
 */

public class BeanOneObj extends CommonBean<Void> {


    /*
    * 如果没有数组的传一个Void 或者什么都不传
    * */

    /**
     * obj : {"name":"Tony老师聊shell\u2014\u2014环境变量配置文件","age":12312}
     */

    @SerializedName("obj")
    private ObjBean objX;

    public ObjBean getObjX() {
        return objX;
    }

    public void setObjX(ObjBean objX) {
        this.objX = objX;
    }

    public static class ObjBean {
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
