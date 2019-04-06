package com.ob.java8.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: oubin
 * @date: 2019/1/14 09:09
 * @Description:
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "this", "is", "our", "world");
//        list.stream().map(word -> word.split(""))
//                .distinct()
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//
//        String[] strings = {"hello", "world"};
//        Stream<String> stringStream = Arrays.stream(strings);
//        stringStream.map(word -> word.split(""))
//                .map(Arrays::stream)
//                .distinct()
//                .collect(Collectors.toList());
//
//        list.stream().map(word -> word.split(""))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .collect(Collectors.toList());

//        System.out.println(list.stream().filter(word -> word.length() > 2).findFirst().orElse("aaa"));
//        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//        System.out.println(map.get("world"));
        List<Integer> integers = Arrays.asList(1,3,5,7,9);
        List<Integer> integers1 = integers.stream().peek(System.out::println)
                .map(x -> x + 11)
                .collect(Collectors.toList());
        System.out.println(integers1);
        Function<String, Integer> stringIntegerFunction = Integer::parseInt;


    }
}
