package jdk8.lynda.chap02;

public class Topic01_Solution_UseInterfaceWithArgs {

    public static void main(String[] args) {

        Topic01_Solution_InterfaceWithArgs obj = (v1, v2) -> {
            int result = v1 + v2;
            System.out.println("The result is " + result);

        };
        obj.calculate(10, 5);

    }

}
