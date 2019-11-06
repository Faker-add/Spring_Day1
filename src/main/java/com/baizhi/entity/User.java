package com.baizhi.entity;

import java.util.*;

public class User {
    private String id;
    private String username;
    private String password;
    private Integer age;
    private String[]  names;
    private List<String>  ls;
    private Set<String>  st;
    private Map<String,String> maps;
    private Properties  properties;

    public User() {
        System.out.println("我是User类中的无参构造");
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setLs(List<String> ls) {
        this.ls = ls;
    }

    public void setSt(Set<String> st) {
        this.st = st;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", names=" + Arrays.toString(names) +
                ", ls=" + ls +
                ", st=" + st +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }
}
