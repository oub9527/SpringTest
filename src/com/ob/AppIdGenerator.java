package com.ob;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @Auther: Administrator
 * @Date: 2018/8/29 09:34
 * @Description:
 */
public class AppIdGenerator {


    private static String generation(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        SecureRandom secureRandom = new SecureRandom();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }

        return sb.toString();
    }

    public static String generationAppId() {
        return "im" + generation(16);
    }

    public static void main(String[] args) {
        System.out.println(generationAppId());
    }
}
