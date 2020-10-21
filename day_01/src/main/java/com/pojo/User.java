package com.pojo;

import java.util.List;
import java.util.Map;

public class User {
    private String name;
    private String age;
    private Double mony;
    private List<User> list;
    private Map<String,User> map;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", mony=" + mony +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getMony() {
        return mony;
    }

    public void setMony(Double mony) {
        this.mony = mony;
    }

}
