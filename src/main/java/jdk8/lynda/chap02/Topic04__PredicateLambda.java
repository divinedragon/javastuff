package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Topic04__PredicateLambda {

    public static void main(String args[]) {

        List<Topic04__Person> people = new ArrayList<>();

        people.add(new Topic04__Person("Joe", 48));
        people.add(new Topic04__Person("Mary", 30));
        people.add(new Topic04__Person("Mike", 73));

        Predicate<Topic04__Person> predicateOlder = (Topic04_Person) -> Topic04_Person.getAge() >= 65;
        Predicate<Topic04__Person> predicateYounger = (Topic04_Person) -> Topic04_Person.getAge() < 65;

        filterPeople(people, predicateOlder);
        filterPeople(people, predicateYounger);
    }

    private static void filterPeople(List<Topic04__Person> people, Predicate<Topic04__Person> predicate) {
        people.forEach((p) -> {
            if (predicate.test(p)) {
                System.out.println(p.toString());
            }
        });
    }
}