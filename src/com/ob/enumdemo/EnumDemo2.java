package com.ob.enumdemo;

/**
 * @Auther: Administrator
 * @Date: 2018/8/31 10:28
 * @Description:
 */
public class EnumDemo2 {

    public static void main(String[] args) {

        for(Day2 day : Day2.values()) {
            System.out.println("name: " + day.name() + ", desc : " + day.getDesc());
        }

    }
}

enum Day2 {

    MONDAY("星期一"),TUEDDAY("星期二");

    private Day2(String desc) {
        this.desc = desc;
    }

    private String desc;

    public String getDesc() {
        return desc;
    }

}

