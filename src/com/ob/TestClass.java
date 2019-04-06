package com.ob;


import java.util.ArrayList;
import java.util.List;

/**
 * Author: Administrator
 * Time: 2018-07-17 15:39
 */
public class TestClass {
    public static void main(String[] args) {
        System.out.println("dev");
        System.out.println("a-a");

        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        b.add("1");
        b.add("1");
        b.add("1");
        a.add("2");
        a.addAll(b);
        System.out.println();
    }
}
