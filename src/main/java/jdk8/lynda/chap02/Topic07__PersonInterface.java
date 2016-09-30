package jdk8.lynda.chap02;

public interface Topic07__PersonInterface {

    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    static String getPersonInfo(Topic07__Person p) {
        return p.getName() + " (" + p.getAge() + ")";
    }

}
