package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Topic04_Solution_PredicateLambda {

    public static void main(String args[]) {

        List<Topic04_Solution_Person> people = new ArrayList<>();

        people.add(new Topic04_Solution_Person("Joe", 48));
        people.add(new Topic04_Solution_Person("Mary", 30));
        people.add(new Topic04_Solution_Person("Mike", 73));

        Predicate<Topic04_Solution_Person> predOlder = (p) -> p.getAge() >= 65;
        Predicate<Topic04_Solution_Person> predYounger = (p) -> p.getAge() <= 40;

        displayPeople(people, predYounger);
        displayPeople(people, predOlder);

    }

    private static void displayPeople(List<Topic04_Solution_Person> people, Predicate<Topic04_Solution_Person> pred) {
        people.forEach(p -> {
            if (pred.test(p)) {
                System.out.println(p);
            }
        });
    }

}