package com.ob.a;

/**
 * @author: oubin
 * @date: 2018/9/22 14:33
 * @Description:
 */
public class AT {

    public <T> T abc(int a, Class<T> tClass) {
        return (T) tClass;
    }

    public void abcd() {
        String s = abc(1, String.class ) ;

    }
}
