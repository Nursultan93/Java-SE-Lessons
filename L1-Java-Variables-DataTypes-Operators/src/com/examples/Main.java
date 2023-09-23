package com.examples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) {

    MessageFactory m = new MessageFactory(new MailGoner());

    m.sendMessage();




//    Student s1 = new Student("Nigar", "Efendiyeva");
//
//    s1 = null;
//
//    System.gc();



//    try {
//
//      System.out.println("Salam");
//      throw new RuntimeException();
//    }catch (Exception e){
//      System.out.println("exception");
//    }finally {
//      System.out.println("Finally block");
//    }



//    Student s2 = new Student("Murad", "Mirzeyev");

//    System.out.println(s1.hashCode());
//    System.out.println(s2.hashCode());
//
//    //System.out.println(s1.equals(s2));
//
//    List<Student> l = new ArrayList<>();
//    l.add(s1);
//    l.add(s2);
//
//    l.forEach(System.out::println);
//
//    System.out.println("========");
//
//    Set<Student> s = new HashSet<>();
//    s.add(s1);
//    s.add(s2);
//
//    s.forEach(System.out::println);

  }
}
