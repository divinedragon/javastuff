package jdk8.lynda.chap02;

public class Topic01_Solution_UseSimpleInterface {

    public static void main(String[] args) {

        Topic01_Solution_SimpleInterface obj = () -> System.out.println("Say something");
        obj.doSomething();

    }

}
