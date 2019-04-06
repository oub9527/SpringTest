package com.ob.a;

import java.util.HashMap;

/**
 * @author: oubin
 * @date: 2019/1/10 09:48
 * @Description:
 */
public class ProperTestMain {

    public static void main(String[] args) {
        HashMap<ProperTest, String> hashMap = new HashMap<>();
        ProperTest properTest = new ProperTest();
        properTest.setAge("11");
        properTest.setName("ob");
        System.out.println(properTest.hashCode());
        hashMap.put(properTest, "1");
        properTest.setName("aaa");
        System.out.println(properTest.hashCode());
        hashMap.put(properTest, "2");

        System.out.println(hashMap.get(properTest));

    }
}
