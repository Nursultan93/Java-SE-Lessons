package com.examples;

public class Student {
  private String firstName;
  private String lastName;

  public Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Student() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println("Men gc terefinden silinirem xeberin olsun!");
  }

  //finalize v.s finally

  @Override
  public String toString() {
    return "Student{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
