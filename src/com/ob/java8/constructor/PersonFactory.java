package com.ob.java8.constructor;

/**
 * @author: oubin
 * @date: 2019/1/9 11:08
 * @Description:
 */
public interface PersonFactory<P extends Person> {

    P create(String firstName, String lastName);

}
