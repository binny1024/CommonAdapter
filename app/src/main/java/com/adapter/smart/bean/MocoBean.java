package com.adapter.smart.bean;

import com.adapter.smart.common.CommonBean;

/**
 * Created by smart on 2017/4/24.
 */

public class MocoBean extends CommonBean<MocoBean> {

    private int id;
    private String name;
    private String picSmall;
    private String picBig;
    private String description;
    private int learner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicSmall() {
        return picSmall;
    }

    public void setPicSmall(String picSmall) {
        this.picSmall = picSmall;
    }

    public String getPicBig() {
        return picBig;
    }

    public void setPicBig(String picBig) {
        this.picBig = picBig;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLearner() {
        return learner;
    }

    public void setLearner(int learner) {
        this.learner = learner;
    }
}
