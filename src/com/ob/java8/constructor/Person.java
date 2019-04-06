package com.ob.java8.constructor;

/**
 * @author: oubin
 * @date: 2019/1/9 11:07
 * @Description:
 */
public class Person {

    private String firstName;

    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
