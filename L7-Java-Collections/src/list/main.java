package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
  public static void main(String[] args) {

//    List<Person> personList = new ArrayList<>();
//
//    Person samir1 = new Person(1, "Samir", "Memmedov");
//    Person samir2 = new Person(1, "Samir", "Memmedov");
//
//    System.out.println(samir1.hashCode());
//    System.out.println(samir2.hashCode());
//
//    personList.add(samir1);
//    personList.add(samir2);
//
//    for (Person p : personList) {
//      System.out.println(p.getFirstName() +" "+p.getLastName());
//    }


    List<String> list = Arrays.asList("Salam", "Salam");
    for (String s : list){
      System.out.println(s);
    }

    get("Salam", "enwecewncew", "wencewnioew", "oiwenioewncew");


  }


  public static void get(String ... param){

    String[] params = param;

    for (String s : params){
      System.out.println(s);
    }

  }

}
