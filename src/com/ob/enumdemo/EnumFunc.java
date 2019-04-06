package com.ob.enumdemo;

/**
 * @author: oubin
 * @date: 2019/1/9 15:17
 * @Description:
 */
public enum EnumFunc {
    PLUS{
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS{
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    };

    abstract double apply(double x, double y);
}
