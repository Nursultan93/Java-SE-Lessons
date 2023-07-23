package lambda;

import funtional.interfaces.Addition;

public class Run {
    public static void main(String[] args) {

        Addition addition = (a, b) -> {
            a = a + 3;
            b = b + 2;

            return a + b;
        };

        System.out.println(addition.add(4, 6));

    }
}
