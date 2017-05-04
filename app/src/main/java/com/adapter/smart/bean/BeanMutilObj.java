package com.adapter.smart.bean;

import com.smart.holder_library.CommonAdapter;

import java.util.List;

/**
 * Created by smart on 2017/4/24.
 */

public class BeanMutilObj implements CommonAdapter.BaseBean {


    /**
     * status : 1
     * data : [{"id":1,"name":"Tony老师聊shell\u2014\u2014环境变量配置文件","picSmall":"http://img.mukewang.com/55237dcc0001128c06000338-300-170.jpg","picBig":"http://img.mukewang.com/55237dcc0001128c06000338.jpg","description":"为你带来shell中的环境变量配置文件","learner":12312},{"id":2,"name":"数学知识在CSS动画中的应用","picSmall":"http://img.mukewang.com/55249cf30001ae8a06000338-300-170.jpg","picBig":"http://img.mukewang.com/55249cf30001ae8a06000338.jpg","description":"数学知识与CSS结合实现酷炫效果","learner":45625},{"id":3,"name":"Oracle数据库开发必备利器之PL/SQL基础","picSmall":"http://img.mukewang.com/5523711700016d1606000338-300-170.jpg","picBig":"http://img.mukewang.com/5523711700016d1606000338.jpg","description":"Oracle数据库高级开发必备的基础。","learner":41236},{"id":4,"name":"Android见证消息推送时刻进阶篇","picSmall":"http://img.mukewang.com/551e470500018dd806000338-300-170.jpg","picBig":"http://img.mukewang.com/551e470500018dd806000338.jpg","description":"Android消息推送就在眼前，Come on","learner":45456},{"id":5,"name":"Avalon探索之旅基础教程\u2014\u2014复杂绑定","picSmall":"http://img.mukewang.com/551de0570001134f06000338-300-170.jpg","picBig":"http://img.mukewang.com/551de0570001134f06000338.jpg","description":"前端迷您MVVM框架，Avalon复杂绑定属性篇。","learner":56556},{"id":6,"name":"Android-Service系列之断点续传下载","picSmall":"http://img.mukewang.com/552640c300018a9606000338-300-170.jpg","picBig":"http://img.mukewang.com/552640c300018a9606000338.jpg","description":"想升职加薪么？本章课程你值得拥有","learner":48996},{"id":7,"name":"JUnit\u2014Java单元测试必备工具","picSmall":"http://img.mukewang.com/551b92340001c9f206000338-300-170.jpg","picBig":"http://img.mukewang.com/551b92340001c9f206000338.jpg","description":"Java单元测试利器!","learner":13210},{"id":8,"name":"细说Java多线程之内存可见性","picSmall":"http://img.mukewang.com/5518c3d7000175af06000338-300-170.jpg","picBig":"http://img.mukewang.com/5518c3d7000175af06000338.jpg","description":"用两种方式实现内存可见性","learner":15051},{"id":9,"name":"CSS动画实用技巧","picSmall":"http://img.mukewang.com/551b98ae0001e57906000338-300-170.jpg","picBig":"http://img.mukewang.com/551b98ae0001e57906000338.jpg","description":"教你使用CSS实现惊艳的动画效果！","learner":15210},{"id":10,"name":"C++远征之起航篇","picSmall":"http://img.mukewang.com/550b86560001009406000338-300-170.jpg","picBig":"http://img.mukewang.com/550b86560001009406000338.jpg","description":"C++亮点尽在其中","learner":84545},{"id":11,"name":"Tony老师聊shell\u2014\u2014运算符","picSmall":"http://img.mukewang.com/551916790001125706000338-300-170.jpg","picBig":"http://img.mukewang.com/551916790001125706000338.jpg","description":"Tony为你带来shell编程中的运算符！","learner":18411},{"id":12,"name":"如何使用高德云图在线制作属于你的地图","picSmall":"http://img.mukewang.com/5518ecf20001cb4e06000338-300-170.jpg","picBig":"http://img.mukewang.com/5518ecf20001cb4e06000338.jpg","description":"教你迅速使用云图进行基于LBS的开发。","learner":56432},{"id":13,"name":"鬼斧神工之正则表达式","picSmall":"http://img.mukewang.com/5518bbe30001c32006000338-300-170.jpg","picBig":"http://img.mukewang.com/5518bbe30001c32006000338.jpg","description":"正则表达式是计算机编程语言界的鬼斧神工。","learner":25210},{"id":14,"name":"如何使用高德Windows Phone SDK进行基于LBS的开发","picSmall":"http://img.mukewang.com/551380400001da9b06000338-300-170.jpg","picBig":"http://img.mukewang.com/551380400001da9b06000338.jpg","description":"教你迅速使用WP SDK进行基于LBS的开发","learner":56445},{"id":15,"name":"canvas实现星星闪烁特效","picSmall":"http://img.mukewang.com/550a33b00001738a06000338-300-170.jpg","picBig":"http://img.mukewang.com/550a33b00001738a06000338.jpg","description":"使用HTML5实现轮播图片上的序列帧。","learner":45658},{"id":16,"name":"如何使用高德JS-API进行基于LBS的开发","picSmall":"http://img.mukewang.com/5513a1b50001752806000338-300-170.jpg","picBig":"http://img.mukewang.com/5513a1b50001752806000338.jpg","description":"教你迅速用高德JS-API进行基于LBS的开发","learner":15222},{"id":17,"name":"Duang~MySQLi扩展库来袭","picSmall":"http://img.mukewang.com/5513e20600017c1806000338-300-170.jpg","picBig":"http://img.mukewang.com/5513e20600017c1806000338.jpg","description":"Duang~一起开启MySQLi的学习之旅吧!","learner":46321},{"id":18,"name":"如何使用高德Android SDK进行基于LBS的开发","picSmall":"http://img.mukewang.com/550a78720001f37a06000338-300-170.jpg","picBig":"http://img.mukewang.com/550a78720001f37a06000338.jpg","description":"教你迅速使用Android SDK进行基于LBS的开发","learner":12130},{"id":19,"name":"高德地图组件快速入门","picSmall":"http://img.mukewang.com/550a836c0001236606000338-300-170.jpg","picBig":"http://img.mukewang.com/550a836c0001236606000338.jpg","description":"教你迅速使用地图组件进行基于LBS的开发","learner":54540},{"id":20,"name":"如何使用高德定位进行开发","picSmall":"http://img.mukewang.com/550a87da000168db06000338-300-170.jpg","picBig":"http://img.mukewang.com/550a87da000168db06000338.jpg","description":"教你迅速使用定位进行基于LBS的开发","learner":45665},{"id":21,"name":"Yahoo军规","picSmall":"http://img.mukewang.com/530f0ef700019b5906000338-300-170.jpg","picBig":"http://img.mukewang.com/530f0ef700019b5906000338.jpg","description":"做为WEB前端攻城师，您必须知道的网站性能优化规则。","learner":12123},{"id":22,"name":"Ajax全接触","picSmall":"http://img.mukewang.com/549bda090001c53e06000338-300-170.jpg","picBig":"http://img.mukewang.com/549bda090001c53e06000338.jpg","description":"由浅入深，循序渐进学习Ajax的相关概念、原理、实现方式和应用方法。","learner":46456},{"id":23,"name":"jQuery源码解析（DOM与核心模块）","picSmall":"http://img.mukewang.com/547d5a45000156f406000338-300-170.jpg","picBig":"http://img.mukewang.com/547d5a45000156f406000338.jpg","description":"前端架构师的必经之路，揭开框架背后的秘密。","learner":51456},{"id":24,"name":"用字体在网页中画ICON图标","picSmall":"http://img.mukewang.com/54780ea90001f3b406000338-300-170.jpg","picBig":"http://img.mukewang.com/54780ea90001f3b406000338.jpg","description":"图标恋上字体，就像老鼠爱上大米！","learner":16456},{"id":25,"name":"CSS3绚丽照片墙","picSmall":"http://img.mukewang.com/547ed1c9000150cc06000338-300-170.jpg","picBig":"http://img.mukewang.com/547ed1c9000150cc06000338.jpg","description":"简单CSS3属性轻松实现绚丽照片墙效果。","learner":26456},{"id":26,"name":"SEO在网页制作中的应用","picSmall":"http://img.mukewang.com/54214727000160e306000338-300-170.jpg","picBig":"http://img.mukewang.com/54214727000160e306000338.jpg","description":"让您快速迈进SEO的门，不容错过!","learner":12436},{"id":27,"name":"CSS深入理解之absolute","picSmall":"http://img.mukewang.com/54125edc0001ce6306000338-300-170.jpg","picBig":"http://img.mukewang.com/54125edc0001ce6306000338.jpg","description":"全面深入理解CSS的position:absolute声明。","learner":45345},{"id":28,"name":"玩转KISSY框架","picSmall":"http://img.mukewang.com/548165820001b4b006000338-300-170.jpg","picBig":"http://img.mukewang.com/548165820001b4b006000338.jpg","description":"全网唯一系统讲解KISSY框架从入门到精通的教程。","learner":11456},{"id":29,"name":"CSS深入理解之float浮动","picSmall":"http://img.mukewang.com/53d74f960001ae9d06000338-300-170.jpg","picBig":"http://img.mukewang.com/53d74f960001ae9d06000338.jpg","description":"主要介绍了浮动属性的前世与今生，糟粕与精华，误解与滥用等。","learner":45656},{"id":30,"name":"CSS未来","picSmall":"http://img.mukewang.com/54c87c73000150cf06000338-300-170.jpg","picBig":"http://img.mukewang.com/54c87c73000150cf06000338.jpg","description":"CSS之父Bert Bos带来的分享。","learner":13436}]
     * msg : 成功
     */

    private int status;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * name : Tony老师聊shell——环境变量配置文件
         * picSmall : http://img.mukewang.com/55237dcc0001128c06000338-300-170.jpg
         * picBig : http://img.mukewang.com/55237dcc0001128c06000338.jpg
         * description : 为你带来shell中的环境变量配置文件
         * learner : 12312
         */

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
}
