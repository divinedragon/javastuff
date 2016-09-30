package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Topic07__UseStaticMethod {
    public static void main(String args[]) {

        List<Topic07__Person> people = new ArrayList<>();

        people.add(new Topic07__Person("Joe", 48));
        people.add(new Topic07__Person("Mary", 30));
        people.add(new Topic07__Person("Mike", 73));

        Predicate<Topic07__Person> pred = (p) -> p.getAge() > 65;

        displayPeople(people, pred);

    }

    private static void displayPeople(List<Topic07__Person> people, Predicate<Topic07__Person> pred) {
        System.out.println("Selected:");
        people.forEach(p -> {
            if (pred.test(p)) {
                System.out.println(Topic07__PersonInterface.getPersonInfo(p));
            }
        });
    }

}