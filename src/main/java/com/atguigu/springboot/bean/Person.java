package com.atguigu.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
/**
* @ConfigurationProperties  告诉SpringBoot将配置文件中配置的每一个属性的值，映射到这个组件（类）中
 *                          通过配置文件给实体对象赋值
 *      prefix = "person"   配置文件中哪个下面的所有属性经行一一配置
 *
 *      只有这个组件是容器中的组件,才能给容器添加@ConfigurationProperties的功能
 *      所以要把这个组件添加到容器中 @Component
*/
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String lastName;
    private Integer age;
    private boolean boss;
    private Date birthday;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
