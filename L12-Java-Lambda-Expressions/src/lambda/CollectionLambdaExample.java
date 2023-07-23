package lambda;

import java.util.ArrayList;
import java.util.List;

public class CollectionLambdaExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Baki");
        list.add("Seki");
        list.add("Gence");


        list.forEach(System.out::println);
    }
}
