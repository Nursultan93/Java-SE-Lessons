package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {

  private static final String URL = "jdbc:mysql://localhost:3306/test_db";
  private static final String USER = "root";
  private static final String PASSWORD = "root";

  private PreparedStatement preparedStatement;
  //private ResultSet resultSet;
  private Connection connection;


  private Connection getConnection () {
    try {

      Class.forName("com.mysql.jdbc.Driver");
      return DriverManager.getConnection(URL, USER, PASSWORD);

    }catch (SQLException exception) {
      exception.printStackTrace();
    }
    catch (ClassNotFoundException exception) {
      exception.printStackTrace();
    }
    return null;
  }

  public void addEmployee(Employee employee) {

    try {

      connection = getConnection();


      preparedStatement = connection.prepareStatement("insert into employees (name, surname, birthdate, address) values (?, ?, ?, ?)");

      preparedStatement.setString(1, employee.getName());
      preparedStatement.setString(2, employee.getSurname());
      preparedStatement.setDate(3, java.sql.Date.valueOf(employee.getBirthdate()));
      preparedStatement.setString(4, employee.getAddress());

      preparedStatement.execute();

      System.out.println(employee.getName() + " ugurla database elave olundu!");

    }catch (SQLException e) {
      e.printStackTrace();
    }finally {
      close();
    }

  }

  public List<Employee> getAllEmployee() {

    List<Employee> employeeList = new ArrayList<>();

    try {

      connection = getConnection();

      preparedStatement = connection.prepareStatement("select * from employees");

      ResultSet resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {

        Employee employee = new Employee();

        employee.setId(resultSet.getInt("id"));
        employee.setName(resultSet.getString("name"));
        employee.setSurname(resultSet.getString("surname"));
        employee.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
        employee.setAddress(resultSet.getString("address"));

        employeeList.add(employee);
      }


    }catch (SQLException e){
      e.printStackTrace();
    }finally {
      close();
    }
    return employeeList;
  }


  public Employee updateEmployee(Employee employee) {
    Employee employeeNew = new Employee();
    try {

      connection = getConnection();

      preparedStatement = connection.prepareStatement("update employees set name = ?, surname = ?, birthdate = ?, address = ? where id = ?");

      preparedStatement.setString(1, employee.getName());
      preparedStatement.setString(2, employee.getSurname());
      preparedStatement.setDate(3, java.sql.Date.valueOf(employee.getBirthdate()));
      preparedStatement.setString(4, employee.getAddress());
      preparedStatement.setInt(5, employee.getId());

      preparedStatement.executeUpdate();

      preparedStatement = connection.prepareStatement("select * from employees where id = ?");

      preparedStatement.setInt(1, employee.getId());

      ResultSet resultSet = preparedStatement.executeQuery();


      while (resultSet.next()) {

        employeeNew.setId(resultSet.getInt("id"));
        employeeNew.setName(resultSet.getString("name"));
        employeeNew.setSurname(resultSet.getString("surname"));
        employeeNew.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
        employeeNew.setAddress(resultSet.getString("address"));
      }

    }catch (SQLException e) {
      e.printStackTrace();
    }finally {
      close();
    }
    return employeeNew;
  }


  public void deleteEmployee(Integer id) {

    try {
      connection = getConnection();

      preparedStatement = connection.prepareStatement("delete from employees where id = ?");

      preparedStatement.setInt(1, id);

      preparedStatement.executeUpdate();

    }catch (SQLException e){
      e.printStackTrace();
    }finally {
      close();
    }

  }


  public List<EmployeeDepartment> gelAllEmpDep() {

    List<EmployeeDepartment> list = new ArrayList<>();
    try {

      connection = getConnection();

      preparedStatement = connection.prepareStatement("select e.name, e.surname, e.birthdate, d.name as dep_name from employees e\n" +
          "inner join department d on e.dep_id = d.id");

      ResultSet resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        EmployeeDepartment employeeDepartment = new EmployeeDepartment();

        employeeDepartment.setName(resultSet.getString("name"));
        employeeDepartment.setSurname(resultSet.getString("surname"));
        employeeDepartment.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
        employeeDepartment.setDepName(resultSet.getString("dep_name"));

        list.add(employeeDepartment);
      }

    }catch (SQLException e){
      e.printStackTrace();
    }finally {
      close();
    }

    return list;
  }

  private void close() {
    try {
      connection.close();
      preparedStatement.close();
      //resultSet.close();
    }catch (SQLException e) {
      e.printStackTrace();
    }
  }



}
