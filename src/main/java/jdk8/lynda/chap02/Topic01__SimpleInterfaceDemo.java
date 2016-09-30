package jdk8.lynda.chap02;

public class Topic01__SimpleInterfaceDemo {

    public static void main(String[] args) {

        Topic01__SimpleInterface s1 = () -> System.out.println("I did something");
        s1.doSomething();

        Topic01__InterfaceWithArgs s2 = (v1, v2) -> {
            int result = v1 * v2;
            System.out.println("Result is " + result);
        };
        s2.multiplyArgs(5, 10);
    }
}