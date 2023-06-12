package loops;

public class Main {

  public static void main(String[] args) {

    Student natiq = new Student("Natiq", "Eliyev", 20);
    Student samed = new Student("Samed", "Yilmaz", 34);
    Student seid = new Student("Seid", "Memmedov", 23);

    Student [] students = new Student[3];
    students[0] = natiq;
    students[1] = samed;
    students[2] = seid;

    for (Student student : students) {
      System.out.println(student.getSurname());
    }

//    for (int i=0; i<students.length; i++) {
//      System.out.println(students[i].getName());
//    }


//    String names [] = new String[]{"Arzu", "Nergiz", "ELi", "Elcin", "Vahid"};
//
//
//    for (String s : names) {
//      System.out.println(s);
//    }


//    for (int i=0; i<names.length; i++) {
//      System.out.println(names[i]);
//    }


  }

}

class Student {

  private String name;
  private String surname;
  private int age;

  public Student(String name, String surname, int age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public void printInfo() {
    System.out.println(this.name +" " +this.surname + " "+this.age);
  }

}
