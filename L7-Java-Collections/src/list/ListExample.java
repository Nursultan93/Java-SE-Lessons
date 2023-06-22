package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
  public static void main(String[] args) {


    List<String> list = new ArrayList<>();

    list.add("Java");
    list.add("C#");
    list.add("Php");
    list.add("NodeJs");
    list.iterator();

    for (String s : list){
      System.out.println(s);
    }

    System.out.println("=============");

    System.out.println("Size: "+list.size());

    System.out.println("=============");

    System.out.println("Bosdurmu: "+list.isEmpty());

    System.out.println("=============");

    System.out.println("Php varmi?: "+list.contains("Tubro Pascal"));

    System.out.println("=============");

    Iterator<String> iterable = list.iterator();

    while (iterable.hasNext()) {
      System.out.println("Iterafor: "+iterable.next());
    }

    System.out.println("=============");

    Object [] objArray = list.toArray();

    for (Object s : objArray){
      System.out.println(s);
    }

    System.out.println("=============");

    String silinmis =  list.remove(1);
    boolean silinibmi =  list.remove("Php");

    System.out.println("Php silindimi?: "+silinibmi);

    System.out.println("Silinen: "+silinmis);

    for (String s : list){
      System.out.println(s);
    }

    System.out.println("=============");

    List<String> l2 = new ArrayList<>();
    l2.add("Java");
    l2.add("NodeJs");

    System.out.println(list.containsAll(l2));;

    System.out.println("=============");

    list.set(0, "Perl");

    //System.out.println(list.get(0));

    for (String s : list){
      System.out.println(s);
    }

    System.out.println("=============");

    int index =  list.indexOf("NodeJs");
    System.out.println(index);

  }
}
