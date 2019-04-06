package com.ob.java8.optional;

/**
 * @author: oubin
 * @date: 2019/1/5 14:58
 * @Description:
 */
public class User {

    private Num1 num1;

    private String name;

    private int age;

    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Num1 getNum1() {
        return num1;
    }

    public void setNum1(Num1 num1) {
        this.num1 = num1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
