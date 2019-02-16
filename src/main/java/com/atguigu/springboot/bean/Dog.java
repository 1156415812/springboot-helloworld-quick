package com.atguigu.springboot.bean;

public class Dog {

    public String name;
    public Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
