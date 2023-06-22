package list;

import java.util.ArrayList;
import java.util.List;

public class ListEmpExample {
  public static void main(String[] args) {

    List<Employee> list = new ArrayList<>();

    Employee nermin = new Employee("Nermin", "Babayeva");
    Employee nergiz = new Employee("Nergiz", "Semedova");
    Employee senan = new Employee("Senan", "Haciyev");

    list.add(nergiz);
    list.add(nermin);
    list.add(senan);

    for(Employee employee : list) {
      System.out.println(employee.getfName());
    }

    System.out.println("=============");

    list.set(2, new Employee("Eli", "Eliyev"));

    for(Employee employee : list) {
      System.out.println(employee.getfName());
    }

//    System.out.println("=============");
//
//    list.removeIf(employee -> employee.getfName().startsWith("E"));
//
//    for(Employee employee : list) {
//      System.out.println(employee.getfName());
//    }

    System.out.println("=============");

    list.replaceAll(employee -> {
      employee.setfName(employee.getfName() + " Test");
      return employee;
    });

    for(Employee employee : list) {
      System.out.println(employee.getfName());
    }

  }
}
