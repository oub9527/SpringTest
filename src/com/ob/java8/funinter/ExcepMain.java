package com.ob.java8.funinter;

/**
 * @author: oubin
 * @date: 2019/1/10 15:54
 * @Description:
 */
public class ExcepMain {

    public static void main(String[] args) {
        ExcepTest excepTest = () -> {
            try {
                System.out.println("abc");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }
}
