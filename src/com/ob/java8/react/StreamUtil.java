package com.ob.java8.react;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: oubin
 * @date: 2019/1/3 17:08
 * @Description:
 */
public class StreamUtil {

    public static <T, R> List<R> map(List<T> data, Function<T, R> mapFunc) {
        return data.stream().map(mapFunc).collect(Collectors.toList());
    }
}
