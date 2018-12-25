package com.ob.java8.funinter;
/**
 * @author: oubin
 * @date: 2018/12/24 09:16
 * @Description:
 */
public class PrintInfoMain {

    public static void main(String[] args) {
        PrintInfo p = (x) -> System.out.println(x);
        p.print("abc");
        p.printDefault();
        PrintInfo.printStatic();
        try {
            int x= 6/0;
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("继续执行");
    }
}
