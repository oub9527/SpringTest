package com.ob.java8.constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author: oubin
 * @date: 2019/1/9 11:09
 * @Description:
 */
public class PersonTest {

    public static void main(String[] args) {

        PersonFactory<Person> p = new PersonFactory<Person>() {
            @Override
            public Person create(String firstName, String lastName) {
                return new Person(firstName, lastName);
            }
        };

        PersonFactory<Person> p3 = Person::new;
        p3.create("1","2");

        List<Person> list = new ArrayList<>();
        list.add(new Person("2", "2"));
        list.add(new Person("1", "1"));
        list.sort(Comparator.comparing(Person::getFirstName));
        list.forEach((x) -> System.out.println(x.getFirstName() ));


    }
}
