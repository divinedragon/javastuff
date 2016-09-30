package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Topic06_Solution_UseDefaultMethod {
    public static void main(String args[]) {

        List<Topic06_Solution_Person> people = new ArrayList<>();

        people.add(new Topic06_Solution_Person("Joe", 48));
        people.add(new Topic06_Solution_Person("Mary", 30));
        people.add(new Topic06_Solution_Person("Mike", 73));

        Predicate<Topic06_Solution_Person> pred = (p) -> p.getAge() > 65;

        displayPeople(people, pred);

    }

    private static void displayPeople(List<Topic06_Solution_Person> people, Predicate<Topic06_Solution_Person> pred) {
        System.out.println("Selected:");
        people.forEach(p -> {
            if (pred.test(p)) {
                System.out.println(p.getPersonInfo());
            }
        });
    }

}