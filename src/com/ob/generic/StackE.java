package com.ob.generic;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author: oubin
 * @date: 2019/1/9 14:19
 * @Description:
 */
public class StackE<E> {
    private E[] elements;

    private int size = 0;

    private static final int DEFAULT = 16;

    @SuppressWarnings("unchecked")
    public StackE() {
        elements = (E[]) new Object[DEFAULT];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = elements[--size];
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
