package com.ob.java8.optional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: oubin
 * @date: 2018/12/27 09:57
 * @Description:
 */
public class Op {

    public static void main(String[] args) {
//        System.out.println(Optional.ofNullable(null));
//        Optional<String> optionalS = Optional.of("abc");
//        Optional<Integer> o = Optional.empty();
//        System.out.println(o.orElse(12));
//        List<String> list= Arrays.asList("a", "A", null);
//        list.stream().map(String::toLowerCase).collect(Collectors.toList()).forEach(System.out::println);
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                InstanceTest instanceTest = new InstanceTest(s);
//                instanceTest.notStatic();
//            }
//        });
//        list.forEach(x -> new InstanceTest());
//        list.forEach(InstanceTest::staticFunction2);
//
//        System.out.println(list.stream().filter(x -> x != null).count());
//        Map map = new HashMap();
//        Object object = (Runnable) () -> System.out.println("hello world");
//        ((Runnable) object).run();
//        Function<Integer, Integer> f = e -> e * 2;
//        Predicate<Integer> predicate = e -> e > 0;
//        Consumer<Integer> consumer = e -> System.out.println();
//        BinaryOperator<Integer> binaryOperator = (i1, i2) -> i1 + i2;
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);

//        Num1 num1 = new Num1();
//        Num2 num2 = new Num2();
//        String s = getString(num1);
//        List<String> list = new ArrayList<String>();
//        Predicate<String> predicate = list::add;

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.plusDays(1));


    }

    private static String getString(Num1 num1) {
        Optional<String> optionalS = Optional.ofNullable(num1).map(Num1::getNum2)
                .map(Num2::getName);
        return optionalS.orElseGet(String::new);


    }
}
