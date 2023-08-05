package jdbc;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    DatabaseConnection databaseConnection = new DatabaseConnection();

    Employee employee = new Employee("David", "Musayev", LocalDate.of(1990, 10, 04), "Resid Behbudov street");

    databaseConnection.addEmployee(employee);

  }
}
