package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Topic05_Solution_StaticMethodReference {
    public static void main(String args[]) {

        List<Topic05_Solution_Person> people = new ArrayList<>();

        people.add(new Topic05_Solution_Person("Joe", 48));
        people.add(new Topic05_Solution_Person("Mary", 30));
        people.add(new Topic05_Solution_Person("Mike", 73));

        Collections.sort(people, Topic05_Solution_Person::compareAges);
        people.forEach(p -> System.out.println(p));
    }

}
