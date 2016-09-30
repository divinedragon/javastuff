package jdk8.lynda.chap02;

public class Topic06_Solution_Person implements Topic06_Solution_PersonInterface {
    private String name;
    private int age;

    public Topic06_Solution_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
