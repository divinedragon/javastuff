package jdk8.lynda.chap01;

public class Topic01_TestJava8 {

    public static void main(String[] args) {

        // An instance of a functional interface using a lambda expression
        Topic01_TestInterface tester = () -> System.out.println("Java SE 8 is working!");
        tester.test();

    }

}
