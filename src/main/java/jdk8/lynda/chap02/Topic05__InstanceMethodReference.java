package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Topic05__InstanceMethodReference {

    public static void main(String args[]) {
        Topic05__InstanceMethodReference mainClass = new Topic05__InstanceMethodReference();
        mainClass.sortData();
    }

    public void sortData() {

        List<Topic05__Person> people = new ArrayList<>();

        people.add(new Topic05__Person("Joe", 48));
        people.add(new Topic05__Person("Mary", 30));
        people.add(new Topic05__Person("Mike", 73));

        Collections.sort(people, this::compareAges);
        people.forEach(p -> System.out.println(p));
    }

    public int compareAges(Topic05__Person p1, Topic05__Person p2) {
        Integer age1 = p1.getAge();
        return age1.compareTo(p2.getAge());
    }
}
