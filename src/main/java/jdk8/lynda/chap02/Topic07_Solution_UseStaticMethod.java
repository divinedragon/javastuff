package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Topic07_Solution_UseStaticMethod {
    public static void main(String args[]) {

        List<Topic07_Solution_Person> people = new ArrayList<>();

        people.add(new Topic07_Solution_Person("Joe", 48));
        people.add(new Topic07_Solution_Person("Mary", 30));
        people.add(new Topic07_Solution_Person("Mike", 73));

        Predicate<Topic07_Solution_Person> pred = (p) -> p.getAge() > 65;

        displayPeople(people, pred);

    }

    private static void displayPeople(List<Topic07_Solution_Person> people, Predicate<Topic07_Solution_Person> pred) {
        System.out.println("Selected:");
        people.forEach(p -> {
            if (pred.test(p)) {
                String info = Topic07_Solution_PersonInterface.getPersonInfo(p);
                System.out.println(info);
            }
        });
    }

}