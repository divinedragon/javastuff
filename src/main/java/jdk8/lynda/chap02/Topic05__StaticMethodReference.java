package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Topic05__StaticMethodReference {
    public static void main(String args[]) {

        List<Topic05__Person> people = new ArrayList<>();

        people.add(new Topic05__Person("Joe", 48));
        people.add(new Topic05__Person("Mary", 30));
        people.add(new Topic05__Person("Mike", 73));

        Collections.sort(people, Topic05__Person::compareAges);
        people.forEach(p -> System.out.println(p));
    }

}
