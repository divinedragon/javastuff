package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Topic04__PredicateInnerClass {
    public static void main(String args[]) {

        List<Topic04__Person> people = new ArrayList<>();

        people.add(new Topic04__Person("Joe", 48));
        people.add(new Topic04__Person("Mary", 30));
        people.add(new Topic04__Person("Mike", 73));

        Predicate<Topic04__Person> predicate = new Predicate<Topic04__Person>() {
            @Override
            public boolean test(Topic04__Person p) {
                return (p.getAge() >= 65);
            }
        };

        for (Topic04__Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p.toString());
            }
        }
    }
}
