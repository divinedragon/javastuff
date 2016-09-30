package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Topic05_Solution_InstanceMethodReference {

    public static void main(String args[]) {
        Topic05_Solution_InstanceMethodReference mainClass = new Topic05_Solution_InstanceMethodReference();
        mainClass.sortData();
    }

    public void sortData() {

        List<Topic05_Solution_Person> people = new ArrayList<>();

        people.add(new Topic05_Solution_Person("Joe", 48));
        people.add(new Topic05_Solution_Person("Mary", 30));
        people.add(new Topic05_Solution_Person("Mike", 73));

        Collections.sort(people, this::compareAges);
        people.forEach(p -> System.out.println(p));
    }

    public int compareAges(Topic05_Solution_Person p1, Topic05_Solution_Person p2) {
        Integer age1 = p1.getAge();
        return age1.compareTo(p2.getAge());
    }

}
