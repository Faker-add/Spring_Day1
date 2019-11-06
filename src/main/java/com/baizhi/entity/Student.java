package com.baizhi.entity;

public class Student {
    private  Integer id;
    private  String  stuname;
    private  Double  score;

    public Student(Integer id, String stuname, Double score) {
        this.id = id;
        this.stuname = stuname;
        this.score = score;
    }

    public Student() {
        System.out.println("我是Student中的无参构造");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    //声明初始化方法
    public void   init(){
        System.out.println("对象创建时被调用");
    }
    //声明销毁方法
    public void destory(){
        System.out.println("对象销毁时被调用");
    }


}
