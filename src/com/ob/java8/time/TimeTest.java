package com.ob.java8.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author: oubin
 * @date: 2019/1/4 18:19
 * @Description:
 */
public class TimeTest {

    public static void main(String[] args) {

        System.out.println(Instant.now().getEpochSecond());
//        testClock();
//        testInstant();
//        testLocalDateTime();
    }

    public static void testClock() {
        Clock c1 = Clock.systemUTC();
        System.out.println(c1.instant());
        Clock c2 = Clock.systemDefaultZone();
        System.out.println(c2.instant());
    }

    public static void testInstant() {
        Instant instant = Instant.now();
        System.out.println(instant);
    }

    public static void testLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
