package com.ob.java8.def;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.IntPredicate;

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

        List<String> x = new LinkedList<>();
        Comparator<Integer> a = (z, y) -> z * y;
    }
}
