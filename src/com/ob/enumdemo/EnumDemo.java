package com.ob.enumdemo;

/**
 * @Auther: Administrator
 * @Date: 2018/8/31 10:11
 * @Description:
 */
public class EnumDemo {

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day.toString());
    }
}
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
