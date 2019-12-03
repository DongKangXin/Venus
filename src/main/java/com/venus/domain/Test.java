package com.venus.domain;

/**
 * @author dongkx
 * @version 0.0.1
 * @date 2019/12/3
 */
public class Test {
    private String name;
    private Integer age;

    public Test(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}