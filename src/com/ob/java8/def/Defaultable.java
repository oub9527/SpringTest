package com.ob.java8.def;

/**
 * @author: oubin
 * @date: 2018/12/20 11:05
 * @Description:
 */
public interface Defaultable {

    default String notRequired() {
        return "Default";
    }
}
