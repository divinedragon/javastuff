package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Topic04_Solution_PredicateInnerClass {
    public static void main(String args[]) {

        List<Topic04_Solution_Person> people = new ArrayList<>();

        people.add(new Topic04_Solution_Person("Joe", 48));
        people.add(new Topic04_Solution_Person("Mary", 30));
        people.add(new Topic04_Solution_Person("Mike", 73));

        Predicate<Topic04_Solution_Person> pred = new Predicate<Topic04_Solution_Person>() {

            @Override
            public boolean test(Topic04_Solution_Person p) {
                return (p.getAge() >= 65);
            }
        };

        for (Topic04_Solution_Person person : people) {
            if (pred.test(person)) {
                System.out.println(person.toString());
            }
        }

    }
}
