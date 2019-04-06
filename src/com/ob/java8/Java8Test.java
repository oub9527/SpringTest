package com.ob.java8;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: oubin
 * @date: 2018/12/19 18:57
 * @Description:
 */
public class Java8Test {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        Collections.sort(list, (s1, s2) -> -s1.compareTo(s2));
//
//        Arrays.asList("a", "b").forEach(e -> System.out.println(e));
//        Arrays.asList("c").forEach(e -> {
//            System.out.println(e);
//            System.out.println(e);
//        });

//        List<String> list1 = new ArrayList<>();
//        list1.add("a");
//        list1.add("b");
//        List<String> list2 = list1.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
//        list2.forEach(name -> System.out.println(name));
//
//        List<Integer> nums = new ArrayList<>(Arrays.asList(1,1,null,2,3,4,null,5,6,7,8,9,10));
//        System.out.println(nums.stream().filter(num -> num != null).distinct().mapToInt(num -> num * 2).peek(System.out::println).skip(2).limit(4).sum()
//                );

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        List<Integer> integers1 = integers.stream().filter(x ->  x > 5).collect(Collectors.toList());
        integers1.add(0);
        integers1 = null;
        List<Integer> collect = integers1.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(collect);



    }
}
