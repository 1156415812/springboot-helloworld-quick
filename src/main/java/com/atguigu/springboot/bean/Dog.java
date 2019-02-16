package com.atguigu.springboot.bean;

public class Dog {

    private String name;

    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
