package com.ob.generic;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author: oubin
 * @date: 2019/1/9 14:12
 * @Description:
 */
public class Stack {

    private Object[] elements;

    private int size = 0;

    private static final int DEFAULT = 16;

    public Stack() {
        elements = new Object[DEFAULT];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpay() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
