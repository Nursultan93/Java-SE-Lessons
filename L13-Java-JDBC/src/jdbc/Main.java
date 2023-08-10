package jdbc;

import java.time.LocalDate;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    DatabaseConnection databaseConnection = new DatabaseConnection();

    //Employee employee = new Employee("David", "Musayev", LocalDate.of(1990, 10, 04), "Resid Behbudov street");

    //databaseConnection.addEmployee(employee);

//    List<Employee> allEmployee = databaseConnection.getAllEmployee();
//
//    allEmployee.forEach(System.out::println);


//    Employee employee = new Employee();
//    employee.setId(7);
//    employee.setName("David");
//    employee.setSurname("Musayev");
//    employee.setBirthdate(LocalDate.of(1999, 03, 8));
//    employee.setAddress("Uzeyir Hacibeyiv street");
//
//    Employee employeeNew = databaseConnection.updateEmployee(employee);
//
//    System.out.println(employeeNew);


   // databaseConnection.deleteEmployee(7);

    List<EmployeeDepartment> list = databaseConnection.gelAllEmpDep();

    list.forEach(System.out::println);

  }
}
