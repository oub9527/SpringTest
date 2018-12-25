package com.ob.java8.def;

/**
 * @author: oubin
 * @date: 2018/12/20 11:06
 * @Description:
 */
public class OverridableImpl implements Defaultable {

    @Override
    public String notRequired() {
        return "Overridden";
    }
}
