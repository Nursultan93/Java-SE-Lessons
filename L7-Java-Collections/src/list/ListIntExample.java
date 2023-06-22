package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListIntExample {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList();
    list.add(5);
    list.add(3);
    list.add(6);
    list.add(9);

    for (Integer a : list) {
      System.out.println(a);
    }

    System.out.println("=============");

    Compare compare = new Compare();

    Collections.sort(list, Collections.reverseOrder());

    for (Integer a : list) {
      System.out.println(a);
    }

  }
}
