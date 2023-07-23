package lambda;

import java.util.*;

public class RunStreamApi {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();

        cityList.add("Baku");
        cityList.add("London");
        cityList.add("Warshaw");
        cityList.add("Berlin");


        Optional<String> reduce = cityList.stream().reduce((city1, city2) -> city1 + ", " + city2);

        System.out.println(reduce.get());
    }
}
