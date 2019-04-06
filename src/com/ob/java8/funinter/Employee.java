package com.ob.java8.funinter;

/**
 * @author: oubin
 * @date: 2019/1/9 16:32
 * @Description:
 */
public class Employee {

    private String name;

    private int age;

    public Employee() {

    }

    public Employee(int age) {
        this.age = age;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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
