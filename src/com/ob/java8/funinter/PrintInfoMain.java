package com.ob.java8.funinter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author: oubin
 * @date: 2018/12/24 09:16
 * @Description:
 */
public class PrintInfoMain {

    public static void main(String[] args) {
        PrintInfo p = System.out::println;
        p.print("abc");
        p.printDefault();
        PrintInfo.printStatic();

        Consumer<String> con = System.out::println;
        con.accept("abc");
//
//        Supplier<Employee> supplier = Employee::new;
//        Employee employee = supplier.get();
//        System.out.println(employee.getAge() + "  " + employee.getName());

        Function<String, Employee> function = Employee::new;
        Employee employee = function.apply("abc");
        System.out.println(employee.getAge() + "  " + employee.getName());


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(null);
        list.add(3);
        list.add(1);
        list.stream().filter(x -> x != null && x >2).forEach(System.out::println);



    }
}
