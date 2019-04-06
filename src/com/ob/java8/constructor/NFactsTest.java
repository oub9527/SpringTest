package com.ob.java8.constructor;

/**
 * @author: oubin
 * @date: 2019/1/9 18:52
 * @Description:
 */
public class NFactsTest {

    public static void main(String[] args) {
        NFacts nFacts = new NFacts.Builder(1).b(2).build();

        System.out.println(nFacts.getA() + nFacts.getB() + nFacts.getC());

    }
}
