package lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMain {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Nigar", "Efendiyeva", 4000.0));
        employeeList.add(new Employee("Orxan", "Veliyev", 1000.0));
        employeeList.add(new Employee("Sadiq", "Eliyev", 2500.0));
        employeeList.add(new Employee("Samur", "Seyidov", 3500.0));


        long count = employeeList.stream().count();

        System.out.println(count);

    }
}
