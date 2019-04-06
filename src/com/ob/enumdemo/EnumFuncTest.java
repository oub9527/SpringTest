package com.ob.enumdemo;

import java.util.EnumSet;

/**
 * @author: oubin
 * @date: 2019/1/9 15:19
 * @Description:
 */
public class EnumFuncTest {

    public static void main(String[] args) {
        EnumFunc enumFunc = EnumFunc.PLUS;

        enumFunc.apply(1,2);

    }
}
