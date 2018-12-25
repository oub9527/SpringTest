package com.ob.java8.funinter;

/**
 * @author: oubin
 * @date: 2018/12/24 09:15
 * @Description:
 */
@FunctionalInterface
public interface PrintInfo {

    void print(String x);

    default void printDefault() {
        System.out.println("默认方法");
    }

    static void printStatic() {
        System.out.println("静态方法");
    }

}
