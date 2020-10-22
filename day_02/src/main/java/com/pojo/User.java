package com.pojo;

public class User {
    private String name;
    private String age;
    private Integer mony;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", mony=" + mony +
                '}';
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

    public Integer getMony() {
        return mony;
    }

    public void setMony(Integer mony) {
        this.mony = mony;
    }
}
