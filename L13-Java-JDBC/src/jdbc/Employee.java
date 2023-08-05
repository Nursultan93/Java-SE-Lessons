package jdbc;

import java.time.LocalDate;

public class Employee {
  private Integer id;
  private String name;
  private String surname;
  private LocalDate birthdate;
  private String address;

  public Employee() {
  }

  public Employee(String name, String surname, LocalDate birthdate, String address) {
    this.name = name;
    this.surname = surname;
    this.birthdate = birthdate;
    this.address = address;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", birthdate=" + birthdate +
        ", address='" + address + '\'' +
        '}';
  }
}
