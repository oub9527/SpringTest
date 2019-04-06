package com.ob.java8.optional;

/**
 * @author: oubin
 * @date: 2018/12/27 16:33
 * @Description:
 */
public class InstanceTest {

    private String a;

    public InstanceTest() {

    }
    public InstanceTest(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void notStatic() {
        System.out.println("非静态方法");
    }

    public static void  staticFunction() {
        System.out.println("无参数的静态方法");
    }

    public static void staticFunction2(String b) {
        System.out.println("带参数的静态方法：" + b);
    }


}
