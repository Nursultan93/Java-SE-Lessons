package jdbc;

import java.time.LocalDate;

public class EmployeeDepartment {
  private String name;
  private String surname;
  private LocalDate birthdate;
  private String depName;

  public EmployeeDepartment() {
  }

  public EmployeeDepartment(String name, String surname, LocalDate birthdate, String depName) {
    this.name = name;
    this.surname = surname;
    this.birthdate = birthdate;
    this.depName = depName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public String getDepName() {
    return depName;
  }

  public void setDepName(String depName) {
    this.depName = depName;
  }

  @Override
  public String toString() {
    return "EmployeeDepartment{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", birthdate=" + birthdate +
        ", depName='" + depName + '\'' +
        '}';
  }
}
