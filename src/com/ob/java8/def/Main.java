package com.ob.java8.def;

/**
 * @author: oubin
 * @date: 2018/12/20 11:07
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Defaultable defaultable = DefaultableFactory.create(DefaultableImpl::new);
        System.out.println(defaultable.notRequired());

        defaultable = DefaultableFactory.create(OverridableImpl::new);
        System.out.println(defaultable.notRequired());

    }
}
