package com.ob.java8.optional;

import java.util.Optional;

/**
 * @author: oubin
 * @date: 2019/1/5 14:59
 * @Description:
 */
public class Grace {

    public static void main(String[] args) {
        User user = new User();
        Optional<User> optionalUser = Optional.ofNullable(user);
        System.out.println(optionalUser.map(User::getNum1).map(Num1::getNum2).map(Num2::getName).orElse("bbb"));

//        System.out.println(optionalUser.orElse(new User("aaa", 11)).getName().length());
    }
}
