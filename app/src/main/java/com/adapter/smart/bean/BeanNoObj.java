package com.adapter.smart.bean;

import com.adapter.smart.common.CommonBean;

/**
 * Created by smart on 2017/4/26.
 */

public class BeanNoObj extends CommonBean<Void> {
    /**
     * name : 徐斌
     * age : 12
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
