package jdk8.lynda.chap02;

public interface Topic07_Solution_PersonInterface {

    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    static String getPersonInfo(Topic07_Solution_Person p) {
        return p.getName() + " (" + p.getAge() + ")";
    }
}
