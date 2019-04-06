package com.ob.java8.optional;

import java.util.Optional;

/**
 * @author: oubin
 * @date: 2019/2/26 16:02
 * @Description:
 */
public class MultiClassTest {

    public static void main(String[] args) {
        Num1 num1 = new Num1();
        Optional<String> stringOptional = Optional
                .ofNullable(num1)
                .map(Num1::getNum2)
                .map(Num2::getName);
        System.out.println(stringOptional.orElseGet(String::new));

        String s = Optional.ofNullable(num1)
                .map(Num1::getNum2)
                .map(Num2::getName)
                .orElse("UNKNOWN");

        String s1 = Optional.ofNullable(num1).map(Num1::getNum2)
                .map(Num2::getName)
                .orElseThrow(() -> new IllegalArgumentException());

        System.out.println(stringOptional.orElseGet(String::new));
    }

}
