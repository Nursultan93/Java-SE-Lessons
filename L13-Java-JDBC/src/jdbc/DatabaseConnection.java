package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
