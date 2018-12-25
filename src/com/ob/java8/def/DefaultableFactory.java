package com.ob.java8.def;

import java.util.function.Supplier;

/**
 * @author: oubin
 * @date: 2018/12/20 11:07
 * @Description:
 */
public interface DefaultableFactory {

    static Defaultable create(Supplier<Defaultable> supplier) {
        return supplier.get();
    }
}
