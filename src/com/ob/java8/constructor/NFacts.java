package com.ob.java8.constructor;

/**
 * @author: oubin
 * @date: 2019/1/9 18:48
 * @Description:
 */
public class NFacts {

    private final int a;

    private int b;

    private int c;

    public static class Builder {
        private int a;

        private int b;

        private int c;

        public Builder(int a) {
            this.a = a;
        }

        public Builder b(int b) {
            this.b = b;
            return this;
        }

        public Builder c(int c) {
            this.c = c;
            return this;
        }

        public NFacts build() {
            return new NFacts(this);
        }
    }

    private NFacts(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }


}
