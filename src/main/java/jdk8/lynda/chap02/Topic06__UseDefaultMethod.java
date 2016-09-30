package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Topic06__UseDefaultMethod {
    public static void main(String args[]) {

        List<Topic06__Person> people = new ArrayList<>();

        people.add(new Topic06__Person("Joe", 48));
        people.add(new Topic06__Person("Mary", 30));
        people.add(new Topic06__Person("Mike", 73));

        Predicate<Topic06__Person> pred = (p) -> p.getAge() > 65;

        displayPeople(people, pred);

    }

    private static void displayPeople(List<Topic06__Person> people, Predicate<Topic06__Person> pred) {
        System.out.println("Selected:");
        people.forEach(p -> {
            if (pred.test(p)) {
                System.out.println(p.getPersonInfo());
            }
        });
    }

}